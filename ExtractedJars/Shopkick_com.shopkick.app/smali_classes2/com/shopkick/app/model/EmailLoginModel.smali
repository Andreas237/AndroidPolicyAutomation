.class public Lcom/shopkick/app/model/EmailLoginModel;
.super Landroid/databinding/BaseObservable;
.source "EmailLoginModel.java"


# instance fields
.field private mEmail:Ljava/lang/String;
    .annotation runtime Landroid/databinding/Bindable;
    .end annotation

    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mError:Ljava/lang/String;

.field private mPassword:Ljava/lang/String;
    .annotation runtime Landroid/databinding/Bindable;
    .end annotation

    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 17
    invoke-direct {p0}, Landroid/databinding/BaseObservable;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/shopkick/app/model/EmailLoginModel;->mEmail:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/shopkick/app/model/EmailLoginModel;->mPassword:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getEmail()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/shopkick/app/model/EmailLoginModel;->mEmail:Ljava/lang/String;

    return-object v0
.end method

.method public getPassword()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/shopkick/app/model/EmailLoginModel;->mPassword:Ljava/lang/String;

    return-object v0
.end method

.method public getmError()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/shopkick/app/model/EmailLoginModel;->mError:Ljava/lang/String;

    return-object v0
.end method

.method public isEmailValid()Z
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/shopkick/app/model/EmailLoginModel;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isPasswordValid()Z
    .locals 1

    .line 53
    invoke-virtual {p0}, Lcom/shopkick/app/model/EmailLoginModel;->getPassword()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public setEmail(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 28
    iput-object p1, p0, Lcom/shopkick/app/model/EmailLoginModel;->mEmail:Ljava/lang/String;

    return-void
.end method

.method public setPassword(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 37
    iput-object p1, p0, Lcom/shopkick/app/model/EmailLoginModel;->mPassword:Ljava/lang/String;

    return-void
.end method

.method public setmError(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/shopkick/app/model/EmailLoginModel;->mError:Ljava/lang/String;

    return-void
.end method
