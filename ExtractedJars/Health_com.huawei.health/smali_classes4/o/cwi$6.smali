.class Lo/cwi$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cwi;


# direct methods
.method constructor <init>(Lo/cwi;)V
    .locals 0

    .line 236
    iput-object p1, p0, Lo/cwi$6;->e:Lo/cwi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 240
    iget-object v0, p0, Lo/cwi$6;->e:Lo/cwi;

    iget-object v1, p0, Lo/cwi$6;->e:Lo/cwi;

    invoke-static {v1}, Lo/cwi;->e(Lo/cwi;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cwi$6;->e:Lo/cwi;

    invoke-static {v2}, Lo/cwi;->b(Lo/cwi;)Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v2

    iget-object v3, p0, Lo/cwi$6;->e:Lo/cwi;

    invoke-static {v3}, Lo/cwi;->c(Lo/cwi;)Lo/bru;

    move-result-object v3

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lo/cwi;->b(Lo/cwi;Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bru;Landroid/content/Context;)V

    .line 241
    return-void
.end method
