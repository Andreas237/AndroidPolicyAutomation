.class public Lcom/google/android/gms/signin/SignIn$SignInOptionsInternal;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/Api$ApiOptions$HasOptions;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/signin/SignIn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SignInOptionsInternal"
.end annotation


# instance fields
.field private final zzada:Landroid/os/Bundle;


# direct methods
.method private constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/signin/SignIn$SignInOptionsInternal;->zzada:Landroid/os/Bundle;

    return-void
.end method

.method public static create(Landroid/os/Bundle;)Lcom/google/android/gms/signin/SignIn$SignInOptionsInternal;
    .locals 1

    new-instance v0, Lcom/google/android/gms/signin/SignIn$SignInOptionsInternal;

    invoke-direct {v0, p0}, Lcom/google/android/gms/signin/SignIn$SignInOptionsInternal;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public getSignInOptionsBundle()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/signin/SignIn$SignInOptionsInternal;->zzada:Landroid/os/Bundle;

    return-object v0
.end method
