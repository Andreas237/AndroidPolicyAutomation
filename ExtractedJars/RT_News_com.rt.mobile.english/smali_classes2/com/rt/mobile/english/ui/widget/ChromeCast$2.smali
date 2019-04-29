.class Lcom/rt/mobile/english/ui/widget/ChromeCast$2;
.super Ljava/lang/Object;
.source "ChromeCast.java"

# interfaces
.implements Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/widget/ChromeCast;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/ChromeCast;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$2;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    .line 151
    iget-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$2;->this$0:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->access$000(Lcom/rt/mobile/english/ui/widget/ChromeCast;Lcom/google/android/gms/cast/CastDevice;)V

    return-void
.end method
