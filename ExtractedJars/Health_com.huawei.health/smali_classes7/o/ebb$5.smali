.class Lo/ebb$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ebb;->d(Lo/eay;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ebb;

.field final synthetic e:Lo/eay;


# direct methods
.method constructor <init>(Lo/ebb;Lo/eay;)V
    .locals 0

    .line 80
    iput-object p1, p0, Lo/ebb$5;->b:Lo/ebb;

    iput-object p2, p0, Lo/ebb$5;->e:Lo/eay;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 83
    iget-object v0, p0, Lo/ebb$5;->b:Lo/ebb;

    invoke-static {v0}, Lo/ebb;->d(Lo/ebb;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iget-object v1, p0, Lo/ebb$5;->e:Lo/eay;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/eba;

    .line 84
    if-eqz v2, :cond_0

    .line 85
    const/4 v0, 0x0

    iput v0, v2, Lo/eba;->c:I

    .line 86
    const/4 v0, 0x0

    iput v0, v2, Lo/eba;->e:I

    .line 88
    iget-object v0, p0, Lo/ebb$5;->b:Lo/ebb;

    iget-object v1, p0, Lo/ebb$5;->e:Lo/eay;

    invoke-static {v0, v1, v2}, Lo/ebb;->a(Lo/ebb;Lo/eay;Lo/eba;)V

    .line 90
    :cond_0
    return-void
.end method
