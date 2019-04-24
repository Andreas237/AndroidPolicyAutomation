.class public Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/operation/utils/CasLoginManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LoginResultEntity"
.end annotation


# instance fields
.field private code:Ljava/lang/String;

.field private euid:Ljava/lang/String;

.field private redirectUrl:Ljava/lang/String;

.field private success:Z

.field private ukmc:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCode()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;->code:Ljava/lang/String;

    return-object v0
.end method

.method public getEuid()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;->euid:Ljava/lang/String;

    return-object v0
.end method

.method public getRedirectUrl()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;->redirectUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getUkmc()Ljava/lang/String;
    .locals 1

    .line 139
    iget-object v0, p0, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;->ukmc:Ljava/lang/String;

    return-object v0
.end method

.method public isSuccess()Z
    .locals 1

    .line 155
    iget-boolean v0, p0, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;->success:Z

    return v0
.end method

.method public setCode(Ljava/lang/String;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;->code:Ljava/lang/String;

    .line 168
    return-void
.end method

.method public setEuid(Ljava/lang/String;)V
    .locals 0

    .line 135
    iput-object p1, p0, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;->euid:Ljava/lang/String;

    .line 136
    return-void
.end method

.method public setRedirectUrl(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;->redirectUrl:Ljava/lang/String;

    .line 152
    return-void
.end method

.method public setSuccess(Z)V
    .locals 0

    .line 159
    iput-boolean p1, p0, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;->success:Z

    .line 160
    return-void
.end method

.method public setUkmc(Ljava/lang/String;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/operation/utils/CasLoginManager$LoginResultEntity;->ukmc:Ljava/lang/String;

    .line 144
    return-void
.end method
