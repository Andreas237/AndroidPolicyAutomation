.class public final synthetic Lcom/ibotta/android/social/google/-$$Lambda$GoogleSignInManagerImpl$UWzY9NyV6OvED2l4WFZBfAPzI8w;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# instance fields
.field private final synthetic f$0:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/social/google/-$$Lambda$GoogleSignInManagerImpl$UWzY9NyV6OvED2l4WFZBfAPzI8w;->f$0:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/social/google/-$$Lambda$GoogleSignInManagerImpl$UWzY9NyV6OvED2l4WFZBfAPzI8w;->f$0:Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-static {v0}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->lambda$onConnected$1(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
