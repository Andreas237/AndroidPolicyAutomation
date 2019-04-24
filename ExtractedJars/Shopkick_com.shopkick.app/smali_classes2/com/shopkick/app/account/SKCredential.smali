.class public Lcom/shopkick/app/account/SKCredential;
.super Ljava/lang/Object;
.source "SKCredential.java"


# instance fields
.field public authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

.field public displayName:Ljava/lang/String;

.field public email:Ljava/lang/String;

.field public password:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/shopkick/app/account/SKCredential;->displayName:Ljava/lang/String;

    .line 21
    sget-object p1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->FACEBOOK:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    iput-object p1, p0, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/shopkick/app/account/SKCredential;->displayName:Ljava/lang/String;

    .line 26
    iput-object p2, p0, Lcom/shopkick/app/account/SKCredential;->email:Ljava/lang/String;

    .line 27
    sget-object p1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->GOOGLE:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    iput-object p1, p0, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/shopkick/app/account/SKCredential;->displayName:Ljava/lang/String;

    .line 14
    iput-object p2, p0, Lcom/shopkick/app/account/SKCredential;->email:Ljava/lang/String;

    .line 15
    iput-object p3, p0, Lcom/shopkick/app/account/SKCredential;->password:Ljava/lang/String;

    .line 16
    sget-object p1, Lcom/shopkick/app/account/Authenticator$AuthMedium;->EMAIL:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    iput-object p1, p0, Lcom/shopkick/app/account/SKCredential;->authMedium:Lcom/shopkick/app/account/Authenticator$AuthMedium;

    return-void
.end method

.method public static createSKCredentialFromEmail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;
    .locals 1

    .line 31
    new-instance v0, Lcom/shopkick/app/account/SKCredential;

    invoke-direct {v0, p0, p1, p2}, Lcom/shopkick/app/account/SKCredential;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static createSKCredentialFromFacebook(Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;
    .locals 1

    .line 35
    new-instance v0, Lcom/shopkick/app/account/SKCredential;

    invoke-direct {v0, p0}, Lcom/shopkick/app/account/SKCredential;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static createSKCredentialFromGoogle(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/account/SKCredential;
    .locals 1

    .line 39
    new-instance v0, Lcom/shopkick/app/account/SKCredential;

    invoke-direct {v0, p0, p1}, Lcom/shopkick/app/account/SKCredential;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
