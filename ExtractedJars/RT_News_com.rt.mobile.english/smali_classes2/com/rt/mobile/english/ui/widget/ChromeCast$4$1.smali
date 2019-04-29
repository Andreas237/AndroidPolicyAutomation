.class Lcom/rt/mobile/english/ui/widget/ChromeCast$4$1;
.super Ljava/lang/Object;
.source "ChromeCast.java"

# interfaces
.implements Lcom/google/android/gms/cast/RemoteMediaPlayer$OnStatusUpdatedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/rt/mobile/english/ui/widget/ChromeCast$4;->onResult(Lcom/google/android/gms/cast/Cast$ApplicationConnectionResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/rt/mobile/english/ui/widget/ChromeCast$4;


# direct methods
.method constructor <init>(Lcom/rt/mobile/english/ui/widget/ChromeCast$4;)V
    .locals 0

    .line 227
    iput-object p1, p0, Lcom/rt/mobile/english/ui/widget/ChromeCast$4$1;->this$1:Lcom/rt/mobile/english/ui/widget/ChromeCast$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStatusUpdated()V
    .locals 0

    return-void
.end method
