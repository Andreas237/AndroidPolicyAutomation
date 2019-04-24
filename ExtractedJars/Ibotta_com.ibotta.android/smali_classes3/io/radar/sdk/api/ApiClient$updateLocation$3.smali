.class final Lio/radar/sdk/api/ApiClient$updateLocation$3;
.super Lkotlin/jvm/internal/Lambda;
.source "ApiClient.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/radar/sdk/api/ApiClient;->updateLocation(Landroid/location/Location;ZZZZLkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "places",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function1;

.field final synthetic $foreground:Z

.field final synthetic $location:Landroid/location/Location;

.field final synthetic $publishableKey:Ljava/lang/String;

.field final synthetic $replayed:Z

.field final synthetic $stopped:Z

.field final synthetic this$0:Lio/radar/sdk/api/ApiClient;


# direct methods
.method constructor <init>(Lio/radar/sdk/api/ApiClient;Ljava/lang/String;Landroid/location/Location;ZZZLkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->this$0:Lio/radar/sdk/api/ApiClient;

    iput-object p2, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$publishableKey:Ljava/lang/String;

    iput-object p3, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$location:Landroid/location/Location;

    iput-boolean p4, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$stopped:Z

    iput-boolean p5, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$foreground:Z

    iput-boolean p6, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$replayed:Z

    iput-object p7, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$callback:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 49
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/radar/sdk/api/ApiClient$updateLocation$3;->invoke(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 9
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 184
    iget-object v0, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->this$0:Lio/radar/sdk/api/ApiClient;

    invoke-static {v0}, Lio/radar/sdk/api/ApiClient;->access$getApiService$p(Lio/radar/sdk/api/ApiClient;)Lio/radar/sdk/api/ApiService;

    move-result-object v1

    iget-object v2, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$publishableKey:Ljava/lang/String;

    iget-object v3, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$location:Landroid/location/Location;

    iget-boolean v4, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$stopped:Z

    iget-boolean v5, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$foreground:Z

    iget-boolean v6, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$replayed:Z

    iget-object v8, p0, Lio/radar/sdk/api/ApiClient$updateLocation$3;->$callback:Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    invoke-virtual/range {v1 .. v8}, Lio/radar/sdk/api/ApiService;->userUpsert(Ljava/lang/String;Landroid/location/Location;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
