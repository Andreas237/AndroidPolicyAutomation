.class Lcom/launchdarkly/android/Util$LazySingleton;
.super Ljava/lang/Object;
.source "Util.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/Util;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LazySingleton"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private instance:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final provider:Lcom/launchdarkly/android/Util$Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/launchdarkly/android/Util$Provider<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/Util$Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/launchdarkly/android/Util$Provider<",
            "TT;>;)V"
        }
    .end annotation

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/launchdarkly/android/Util$LazySingleton;->provider:Lcom/launchdarkly/android/Util$Provider;

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/launchdarkly/android/Util$LazySingleton;->instance:Ljava/lang/Object;

    if-nez v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/launchdarkly/android/Util$LazySingleton;->provider:Lcom/launchdarkly/android/Util$Provider;

    invoke-interface {v0}, Lcom/launchdarkly/android/Util$Provider;->get()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/launchdarkly/android/Util$LazySingleton;->instance:Ljava/lang/Object;

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/launchdarkly/android/Util$LazySingleton;->instance:Ljava/lang/Object;

    return-object v0
.end method
