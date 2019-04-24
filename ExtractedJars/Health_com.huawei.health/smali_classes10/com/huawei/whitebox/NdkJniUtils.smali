.class Lcom/huawei/whitebox/NdkJniUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 8
    const-string v0, "whiteBoxJniLib"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 9
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public native b(I[B[B)[B
.end method

.method public native decrypt([B)[B
.end method

.method public native encrypt(Ljava/lang/String;)[B
.end method

.method public native executeAuth(Ljava/lang/Object;)V
.end method

.method public native getStorageInfo(II)Ljava/lang/String;
.end method

.method public native isAuthChecked()Z
.end method
