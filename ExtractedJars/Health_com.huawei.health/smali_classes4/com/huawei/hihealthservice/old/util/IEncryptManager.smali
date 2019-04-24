.class public interface abstract Lcom/huawei/hihealthservice/old/util/IEncryptManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AES_CBC_BASE64:C = '3'

.field public static final AES_CBC_BINARY:C = '4'

.field public static final AES_CBC_HEX:C = '2'


# virtual methods
.method public abstract getEncryptType(C)C
.end method

.method public abstract getEncryptVersion()C
.end method

.method public abstract getSecret(C)[B
.end method
