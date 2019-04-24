.class Lcom/ibotta/android/service/api/DebugLoadingUtil$1;
.super Ljava/lang/Object;
.source "DebugLoadingUtil.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/service/api/DebugLoadingUtil;->broadcastStatus()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$jobs:[Ljava/lang/String;


# direct methods
.method constructor <init>([Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/service/api/DebugLoadingUtil$1;->val$jobs:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/service/api/DebugLoadingUtil$1;->val$jobs:[Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/android/LocalBroadcast;->broadcastDebugLoading([Ljava/lang/String;)V

    return-void
.end method
