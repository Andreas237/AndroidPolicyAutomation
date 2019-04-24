.class Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util$EncryptManagerMy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hihealthservice/old/util/IEncryptManager;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "EncryptManagerMy"
.end annotation


# instance fields
.field private emkey:Ljava/lang/String;

.field private mVersion:C


# direct methods
.method public constructor <init>(Ljava/lang/String;C)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util$EncryptManagerMy;->emkey:Ljava/lang/String;

    .line 40
    iput-object p1, p0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util$EncryptManagerMy;->emkey:Ljava/lang/String;

    .line 41
    iput-char p2, p0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util$EncryptManagerMy;->mVersion:C

    .line 42
    return-void
.end method


# virtual methods
.method public getEncryptType(C)C
    .locals 1

    .line 57
    const/16 v0, 0x31

    if-ne v0, p1, :cond_0

    .line 59
    const/16 v0, 0x33

    return v0

    .line 61
    :cond_0
    const/16 v0, 0x32

    if-ne v0, p1, :cond_1

    .line 63
    const/16 v0, 0x34

    return v0

    .line 65
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public getEncryptVersion()C
    .locals 1

    .line 71
    iget-char v0, p0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util$EncryptManagerMy;->mVersion:C

    return v0
.end method

.method public getSecret(C)[B
    .locals 1

    .line 47
    const/16 v0, 0x31

    if-eq v0, p1, :cond_0

    const/16 v0, 0x32

    if-ne v0, p1, :cond_1

    .line 49
    :cond_0
    iget-object v0, p0, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util$EncryptManagerMy;->emkey:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hihealthservice/old/db/util/AES_CBC_HEX_Util;->access$000(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0

    .line 51
    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method
