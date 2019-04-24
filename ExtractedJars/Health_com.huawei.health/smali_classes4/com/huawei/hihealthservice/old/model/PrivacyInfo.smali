.class public Lcom/huawei/hihealthservice/old/model/PrivacyInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final ALL:I = 0x0

.field public static final FRIEND:I = 0x1

.field public static final UNKNOWN:I = -0x1

.field private static final serialVersionUID:J = 0x19efe4b79bd3ca13L


# instance fields
.field private privacyType:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hihealthservice/old/model/PrivacyInfo;->privacyType:I

    return-void
.end method


# virtual methods
.method public getPrivacyType()I
    .locals 1

    .line 42
    iget v0, p0, Lcom/huawei/hihealthservice/old/model/PrivacyInfo;->privacyType:I

    return v0
.end method

.method public setPrivacyType(I)V
    .locals 0

    .line 47
    iput p1, p0, Lcom/huawei/hihealthservice/old/model/PrivacyInfo;->privacyType:I

    .line 48
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PrivacyInfo [privacyType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hihealthservice/old/model/PrivacyInfo;->privacyType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
