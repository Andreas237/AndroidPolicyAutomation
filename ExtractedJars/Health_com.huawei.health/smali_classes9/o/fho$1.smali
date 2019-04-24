.class Lo/fho$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fho;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/fho;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/fho;I)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/fho$1;->d:Lo/fho;

    iput p2, p0, Lo/fho$1;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 110
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/fho$1;->d:Lo/fho;

    invoke-static {v0}, Lo/fho;->b(Lo/fho;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 111
    iget-object v0, p0, Lo/fho$1;->d:Lo/fho;

    invoke-static {v0}, Lo/fho;->b(Lo/fho;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fhr;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/fhr;->b(Z)V

    .line 110
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 113
    :cond_0
    const-string v0, "UIME_PersonalHonorSettingAdapter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/fho$1;->e:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    iget-object v0, p0, Lo/fho$1;->d:Lo/fho;

    invoke-static {v0}, Lo/fho;->b(Lo/fho;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lo/fho$1;->e:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fhr;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/fhr;->b(Z)V

    .line 115
    iget-object v0, p0, Lo/fho$1;->d:Lo/fho;

    invoke-static {v0}, Lo/fho;->c(Lo/fho;)Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "PERSONAL_HONOR_SETTING_POSITION"

    iget v3, p0, Lo/fho$1;->e:I

    .line 116
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 115
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 117
    iget-object v0, p0, Lo/fho$1;->d:Lo/fho;

    invoke-static {v0}, Lo/fho;->d(Lo/fho;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v5

    .line 118
    const/4 v0, 0x0

    iput v0, v5, Landroid/os/Message;->what:I

    .line 119
    iget-object v0, p0, Lo/fho$1;->d:Lo/fho;

    invoke-static {v0}, Lo/fho;->b(Lo/fho;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lo/fho$1;->e:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 120
    iget-object v0, p0, Lo/fho$1;->d:Lo/fho;

    invoke-static {v0}, Lo/fho;->d(Lo/fho;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 121
    iget-object v0, p0, Lo/fho$1;->d:Lo/fho;

    invoke-virtual {v0}, Lo/fho;->notifyDataSetChanged()V

    .line 122
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 123
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    const-string v0, "type"

    iget v1, p0, Lo/fho$1;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    sget-object v0, Lo/dae;->eD:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v7

    .line 126
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lo/fho$1;->d:Lo/fho;

    invoke-static {v1}, Lo/fho;->c(Lo/fho;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v7, v6, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 127
    return-void
.end method
