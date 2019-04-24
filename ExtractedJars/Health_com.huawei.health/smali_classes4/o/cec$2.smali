.class Lo/cec$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cec;->c(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cec;

.field final synthetic b:Ljava/util/Map;


# direct methods
.method constructor <init>(Lo/cec;Ljava/util/Map;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lo/cec$2;->a:Lo/cec;

    iput-object p2, p0, Lo/cec$2;->b:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 209
    iget-object v0, p0, Lo/cec$2;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/Map$Entry;

    .line 211
    iget-object v0, p0, Lo/cec$2;->a:Lo/cec;

    invoke-static {v0}, Lo/cec;->c(Lo/cec;)Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    goto :goto_0

    .line 213
    :cond_0
    iget-object v0, p0, Lo/cec$2;->a:Lo/cec;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cec;->d(Lo/cec;Z)Z

    .line 214
    return-void
.end method
