.class public final synthetic Lcom/ibotta/android/security/-$$Lambda$PasswordCacheImpl$mKt7lY1c2TkMbm1qUpQz89uSw10;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/security/PasswordCacheImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/security/PasswordCacheImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/security/-$$Lambda$PasswordCacheImpl$mKt7lY1c2TkMbm1qUpQz89uSw10;->f$0:Lcom/ibotta/android/security/PasswordCacheImpl;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/security/-$$Lambda$PasswordCacheImpl$mKt7lY1c2TkMbm1qUpQz89uSw10;->f$0:Lcom/ibotta/android/security/PasswordCacheImpl;

    invoke-static {v0}, Lcom/ibotta/android/security/PasswordCacheImpl;->lambda$put$0(Lcom/ibotta/android/security/PasswordCacheImpl;)V

    return-void
.end method
