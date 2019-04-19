# Running the Scripts
The scripts should be run from the folder where you want the `classfiles`, `jars`,
and other generated data placed.  In this case it is a folder called `ExtractedJars`.
Here is how this project is organized, some folders omitted for clarity.


## Before Running `decompile.sh`
```
.
|--APKS/
    |--Health_com.huawei.health.apk
    |--Ibotta_com.ibotta.android.apk
    |--Ibotta_com.ibotta.android.apk
    └--LibriVox_app.librivox.android.apk
|--ExtractedJars/
|--Scripts/
    |--clean.sh
    └--decompile.sh

```


## After Running `decompile.sh`
For example let's say you ran: `>> ../Scripts/decompile.sh ../APKs/|--Ibotta_com.ibotta.android.apk`
```
.
|--APKS/
    |--Health_com.huawei.health.apk
    |--Ibotta_com.ibotta.android.apk
    └--LibriVox_app.librivox.android.apk
|--ExtractedJars/
    └--Ibotta_com.ibotta.android/
        |--classfiles/
            └--[many many many classfiles]
        └--javafiles/
            └--[Folder structure with .java files from the project]
|--Scripts/
    |--clean.sh
    └--decompile.sh

```


## After Running `clean.sh`
For example let's say you ran: `>> ../Scripts/clean.sh ../APKs/|--Ibotta_com.ibotta.android.apk`
```
.
|--APKS/
    |--Health_com.huawei.health.apk
    |--Ibotta_com.ibotta.android.apk
    |--Ibotta_com.ibotta.android.apk
    └--LibriVox_app.librivox.android.apk
|--ExtractedJars/
|--Scripts/
    |--clean.sh
    └--decompile.sh

```
