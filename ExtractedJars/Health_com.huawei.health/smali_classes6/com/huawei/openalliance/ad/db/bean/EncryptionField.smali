.class public Lcom/huawei/openalliance/ad/db/bean/EncryptionField;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Lcom/huawei/openalliance/ad/annotations/OuterVisible;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DATA:Ljava/lang/Object;>Ljava/lang/Object;Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1d011f4L


# instance fields
.field private cipherField:Ljava/lang/String;

.field private dataClass:Ljava/lang/Class;

.field private dataMemberClass:Ljava/lang/Class;

.field private originalField:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDATA;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->dataClass:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->dataClass:Ljava/lang/Class;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->dataMemberClass:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public getCipherField()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->cipherField:Ljava/lang/String;

    return-object v0
.end method

.method public getDecryptedFieldValue(Landroid/content/Context;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)TDATA;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->dataClass:Ljava/lang/Class;

    const-class v1, Ljava/lang/String;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/y;->b(Landroid/content/Context;)[B

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->cipherField:Ljava/lang/String;

    invoke-static {v0, v4}, Lcom/huawei/openalliance/ad/utils/b;->b(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    if-nez v0, :cond_1

    invoke-static {p1}, Lcom/huawei/openalliance/ad/utils/y;->b(Landroid/content/Context;)[B

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->cipherField:Ljava/lang/String;

    invoke-static {v0, v4}, Lcom/huawei/openalliance/ad/utils/b;->b(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->dataClass:Ljava/lang/Class;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->dataMemberClass:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5, v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    return-object v0
.end method

.method public getDecryptedFieldValue([B)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)TDATA;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->dataClass:Ljava/lang/Class;

    const-class v1, Ljava/lang/String;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->cipherField:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/utils/b;->b(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->cipherField:Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/utils/b;->b(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->dataClass:Ljava/lang/Class;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    iget-object v2, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->dataMemberClass:Ljava/lang/Class;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4, v0, v1}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/String;Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    return-object v0
.end method

.method public getEncryptedFieldValue([B)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->getDecryptedFieldValue([B)Ljava/lang/Object;

    move-result-object v1

    instance-of v0, v1, Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/huawei/openalliance/ad/utils/b;->a(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->cipherField:Ljava/lang/String;

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lcom/huawei/openalliance/ad/utils/p;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/huawei/openalliance/ad/utils/b;->a(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->cipherField:Ljava/lang/String;

    :goto_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->cipherField:Ljava/lang/String;

    return-object v0
.end method

.method public getOriginalField()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TDATA;"
        }
    .end annotation

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    return-object v0
.end method

.method public isCipherFieldAvailable()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->cipherField:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isOriginalFieldAvailable()Z
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public setCipherField(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->cipherField:Ljava/lang/String;

    return-void
.end method

.method public setOriginalField(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDATA;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/huawei/openalliance/ad/db/bean/EncryptionField;->originalField:Ljava/lang/Object;

    return-void
.end method
