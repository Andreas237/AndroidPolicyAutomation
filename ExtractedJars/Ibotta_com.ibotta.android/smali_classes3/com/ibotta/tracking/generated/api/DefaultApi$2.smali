.class Lcom/ibotta/tracking/generated/api/DefaultApi$2;
.super Ljava/lang/Object;
.source "DefaultApi.java"

# interfaces
.implements Lcom/ibotta/tracking/generated/invoker/ProgressResponseBody$ProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/tracking/generated/api/DefaultApi;->eventsTrackPostAsync(Ljava/util/List;Lcom/ibotta/tracking/generated/invoker/ApiCallback;)Lcom/squareup/okhttp/Call;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/tracking/generated/api/DefaultApi;

.field final synthetic val$callback:Lcom/ibotta/tracking/generated/invoker/ApiCallback;


# direct methods
.method constructor <init>(Lcom/ibotta/tracking/generated/api/DefaultApi;Lcom/ibotta/tracking/generated/invoker/ApiCallback;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/ibotta/tracking/generated/api/DefaultApi$2;->this$0:Lcom/ibotta/tracking/generated/api/DefaultApi;

    iput-object p2, p0, Lcom/ibotta/tracking/generated/api/DefaultApi$2;->val$callback:Lcom/ibotta/tracking/generated/invoker/ApiCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public update(JJZ)V
    .locals 6

    .line 159
    iget-object v0, p0, Lcom/ibotta/tracking/generated/api/DefaultApi$2;->val$callback:Lcom/ibotta/tracking/generated/invoker/ApiCallback;

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/ibotta/tracking/generated/invoker/ApiCallback;->onDownloadProgress(JJZ)V

    return-void
.end method
