.class Lcom/usebutton/sdk/internal/api/ActionCache$1;
.super Ljava/util/LinkedHashMap;
.source "ActionCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/api/ActionCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/LinkedHashMap<",
        "Lcom/usebutton/sdk/internal/functional/Pair<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;",
        "Lcom/usebutton/sdk/internal/util/TtlReference<",
        "Lcom/usebutton/sdk/internal/models/AppAction;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/api/ActionCache;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/api/ActionCache;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/ActionCache$1;->this$0:Lcom/usebutton/sdk/internal/api/ActionCache;

    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    return-void
.end method


# virtual methods
.method protected removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 4

    .line 40
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/ActionCache$1;->size()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x64

    if-le v0, v2, :cond_0

    const-string v0, "ActionCache"

    .line 41
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "At capacity so evicting eldest entry: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method
