.class public interface abstract Lcom/huawei/nfc/carrera/server/download/FileDownloadApi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DOWNLOAD_CANCEL:I = -0x5

.field public static final DOWNLOAD_RESULT_FAIL_FILENOTFOUNDEXCEPTION:I = -0x4

.field public static final DOWNLOAD_RESULT_FAIL_IOEXCEPTION:I = -0x3

.field public static final DOWNLOAD_RESULT_FAIL_NO_NETWORK:I = -0x1

.field public static final DOWNLOAD_RESULT_FAIL_OTHER_ERRORS:I = -0x63

.field public static final DOWNLOAD_RESULT_FAIL_PARAMS_ILLEGAL:I = -0x2

.field public static final DOWNLOAD_RESULT_SUCCESS:I = 0x0


# virtual methods
.method public abstract download(Ljava/lang/String;Ljava/io/File;)I
.end method

.method public abstract download(Ljava/lang/String;Ljava/io/File;Lcom/huawei/nfc/carrera/logic/filedownload/DownLoadListener;)I
.end method
