.class public final synthetic Lcom/ibotta/android/appcache/-$$Lambda$ClearGroupRunnable$ClkO3uCgFp0yme2TdwiBG7eKaok;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/appcache/ClearGroupRunnable;

.field private final synthetic f$1:Ljava/lang/StringBuilder;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/appcache/ClearGroupRunnable;Ljava/lang/StringBuilder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/appcache/-$$Lambda$ClearGroupRunnable$ClkO3uCgFp0yme2TdwiBG7eKaok;->f$0:Lcom/ibotta/android/appcache/ClearGroupRunnable;

    iput-object p2, p0, Lcom/ibotta/android/appcache/-$$Lambda$ClearGroupRunnable$ClkO3uCgFp0yme2TdwiBG7eKaok;->f$1:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/appcache/-$$Lambda$ClearGroupRunnable$ClkO3uCgFp0yme2TdwiBG7eKaok;->f$0:Lcom/ibotta/android/appcache/ClearGroupRunnable;

    iget-object v1, p0, Lcom/ibotta/android/appcache/-$$Lambda$ClearGroupRunnable$ClkO3uCgFp0yme2TdwiBG7eKaok;->f$1:Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Lcom/ibotta/android/appcache/ClearGroupRunnable;->lambda$debugCacheClear$0(Lcom/ibotta/android/appcache/ClearGroupRunnable;Ljava/lang/StringBuilder;)V

    return-void
.end method
