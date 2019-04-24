.class Lcom/shopkick/app/persistence/PersistentMap$1;
.super Ljava/lang/Object;
.source "PersistentMap.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/persistence/PersistentMap;->scheduleFlush()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/persistence/PersistentMap;


# direct methods
.method constructor <init>(Lcom/shopkick/app/persistence/PersistentMap;)V
    .locals 0

    .line 359
    iput-object p1, p0, Lcom/shopkick/app/persistence/PersistentMap$1;->this$0:Lcom/shopkick/app/persistence/PersistentMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 362
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap$1;->this$0:Lcom/shopkick/app/persistence/PersistentMap;

    invoke-static {v0}, Lcom/shopkick/app/persistence/PersistentMap;->access$000(Lcom/shopkick/app/persistence/PersistentMap;)V

    .line 363
    iget-object v0, p0, Lcom/shopkick/app/persistence/PersistentMap$1;->this$0:Lcom/shopkick/app/persistence/PersistentMap;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/shopkick/app/persistence/PersistentMap;->access$102(Lcom/shopkick/app/persistence/PersistentMap;Z)Z

    return-void
.end method
