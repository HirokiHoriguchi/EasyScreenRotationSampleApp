# EasyScreenRotationSampleApp

- 画面の向きとActivityサイクルについて
1. アプリ起動　--> バックキーで終了させた場合
```
2020-06-28 17:39:16.070 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onCreate()
2020-06-28 17:39:16.073 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onStart()
2020-06-28 17:39:16.076 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onResume()
2020-06-28 17:39:26.741 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onStop
2020-06-28 17:39:26.743 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onDestory
```
2. アプリ起動 --> 画面を縦から横に変更させた場合
```
2020-06-28 17:39:16.070 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onCreate()
2020-06-28 17:39:16.073 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onStart()
2020-06-28 17:39:16.076 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onResume()
2020-06-28 17:39:26.741 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onStop
2020-06-28 17:39:26.743 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onDestory
2020-06-28 17:39:26.880 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onCreate()
2020-06-28 17:39:26.919 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onStart()
2020-06-28 17:39:26.920 14774-14774/com.example.easyscreenrotationsampleapp D/Main: onResume()
```
一度終了し、もう一度、onCreate以降が呼ばれるような処理になっている。
つまり、縦画面で処理していた内容が横画面にすると消えてしまう場合があることに注意しないといけない。その対処法を3で確認する。

3. 対処法
AndroidManifestファイルに以下の一文を追記するだけ。
```
android:configChanges="orientation|screenSize"
```
これだけで、Activityが終了することなく維持することができる。
