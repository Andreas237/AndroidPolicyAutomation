.class Lo/ffm$d$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffm$d;->b()Lo/ffm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ffm$d;

.field final synthetic e:Lo/ffm;


# direct methods
.method constructor <init>(Lo/ffm$d;Lo/ffm;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    iput-object p2, p0, Lo/ffm$d$2;->e:Lo/ffm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 135
    iget-object v0, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    iget-object v1, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    invoke-static {v1}, Lo/ffm$d;->b(Lo/ffm$d;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ffm$d;->a(Lo/ffm$d;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    iget-object v0, p0, Lo/ffm$d$2;->e:Lo/ffm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 138
    iget-object v0, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->a(Lo/ffm$d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    const-wide/16 v4, 0x0

    goto :goto_0

    .line 141
    :cond_0
    iget-object v0, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->a(Lo/ffm$d;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    .line 143
    :goto_0
    iget-object v0, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->e(Lo/ffm$d;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hwh_input_history_data_incorrext_distance_toast:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 144
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 145
    const-wide v0, 0x3fb999999999999aL    # 0.1

    cmpg-double v0, v4, v0

    if-ltz v0, :cond_1

    const-wide v0, 0x4072c00000000000L    # 300.0

    cmpl-double v0, v4, v0

    if-lez v0, :cond_4

    .line 146
    :cond_1
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const-wide v1, 0x3fb999999999999aL    # 0.1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x12c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    invoke-static {v1}, Lo/ffm$d;->d(Lo/ffm$d;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 147
    iget-object v0, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    iget-object v1, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    invoke-static {v1}, Lo/ffm$d;->e(Lo/ffm$d;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v7, v1}, Lo/ffm$d;->a(Lo/ffm$d;Ljava/lang/String;Landroid/content/Context;)V

    .line 149
    return-void

    .line 152
    :cond_2
    const-wide v0, 0x3fb999999999999aL    # 0.1

    cmpg-double v0, v4, v0

    if-ltz v0, :cond_3

    const-wide v0, 0x407f400000000000L    # 500.0

    cmpl-double v0, v4, v0

    if-lez v0, :cond_4

    .line 153
    :cond_3
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const-wide v1, 0x3fb999999999999aL    # 0.1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/16 v1, 0x1f4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    invoke-static {v1}, Lo/ffm$d;->d(Lo/ffm$d;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 154
    iget-object v0, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    iget-object v1, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    invoke-static {v1}, Lo/ffm$d;->e(Lo/ffm$d;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v0, v7, v1}, Lo/ffm$d;->a(Lo/ffm$d;Ljava/lang/String;Landroid/content/Context;)V

    .line 156
    return-void

    .line 160
    :cond_4
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v7, v0

    .line 161
    iget-object v0, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->g(Lo/ffm$d;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    invoke-static {v1}, Lo/ffm$d;->d(Lo/ffm$d;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2712

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v7, v3, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v8

    .line 162
    iget-object v0, p0, Lo/ffm$d$2;->a:Lo/ffm$d;

    invoke-static {v0}, Lo/ffm$d;->g(Lo/ffm$d;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 165
    iget-object v0, p0, Lo/ffm$d$2;->e:Lo/ffm;

    invoke-virtual {v0}, Lo/ffm;->dismiss()V

    .line 169
    :cond_5
    return-void
.end method
