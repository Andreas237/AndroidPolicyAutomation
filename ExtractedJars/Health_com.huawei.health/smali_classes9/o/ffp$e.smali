.class public Lo/ffp$e;
.super Landroid/app/AlertDialog$Builder;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ffp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lo/ffp;

.field private c:Lo/dcy;

.field private d:Landroid/os/Handler;

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 13

    .line 70
    invoke-direct {p0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ffp$e;->e:Landroid/content/Context;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    .line 65
    const/16 v0, 0x4e22

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/ffp$e;->a:Ljava/lang/String;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ffp$e;->c:Lo/dcy;

    .line 67
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    .line 71
    iput-object p1, p0, Lo/ffp$e;->e:Landroid/content/Context;

    .line 72
    iput-object p2, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    .line 73
    new-instance v0, Lo/dcy;

    invoke-direct {v0}, Lo/dcy;-><init>()V

    iput-object v0, p0, Lo/ffp$e;->c:Lo/dcy;

    .line 76
    iget-object v0, p0, Lo/ffp$e;->e:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/LayoutInflater;

    .line 77
    sget v0, Lcom/huawei/ui/main/R$layout;->layout_input_data_sport_type_dialog_emui9:I

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 79
    sget v0, Lcom/huawei/ui/main/R$id;->sporttype_run:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    .line 80
    sget v0, Lcom/huawei/ui/main/R$id;->sporttype_walk:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/LinearLayout;

    .line 81
    sget v0, Lcom/huawei/ui/main/R$id;->sporttype_bike:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/LinearLayout;

    .line 82
    sget v0, Lcom/huawei/ui/main/R$id;->sporttype_treadmill:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    .line 83
    sget v0, Lcom/huawei/ui/main/R$id;->sporttype_swim:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout;

    .line 85
    invoke-virtual {v6, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    invoke-virtual {v7, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    invoke-virtual {v8, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 88
    invoke-virtual {v9, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    invoke-virtual {v10, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 90
    sget v0, Lcom/huawei/ui/main/R$id;->btn_sport_type_input_cancel:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/Button;

    .line 91
    invoke-virtual {v11, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    iget-object v0, p0, Lo/ffp$e;->e:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-static {v0, v1}, Lo/ene;->e(Landroid/content/Context;F)I

    move-result v12

    .line 94
    const-string v0, "Track_InputHistoryDataSportTypeDialog"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "padding:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {v5, v12, v0, v12, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 96
    invoke-virtual {p0, v5}, Lo/ffp$e;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 98
    return-void
.end method


# virtual methods
.method public a()Lo/ffp;
    .locals 4

    .line 115
    new-instance v0, Lo/ffp;

    iget-object v1, p0, Lo/ffp$e;->e:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$style;->TrackDialog:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/ffp;-><init>(Landroid/content/Context;ILo/ffp$1;)V

    iput-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    .line 116
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    invoke-super {p0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ffp;->a(Lo/ffp;Landroid/app/AlertDialog;)Landroid/app/AlertDialog;

    .line 117
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    return-object v0
.end method

.method public synthetic create()Landroid/app/AlertDialog;
    .locals 1

    .line 62
    invoke-virtual {p0}, Lo/ffp$e;->a()Lo/ffp;

    move-result-object v0

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 122
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v5

    .line 123
    sget v0, Lcom/huawei/ui/main/R$id;->sporttype_run:I

    if-ne v5, v0, :cond_0

    .line 124
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    if-eqz v0, :cond_5

    .line 125
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    invoke-virtual {v0}, Lo/ffp;->dismiss()V

    .line 126
    iget-object v0, p0, Lo/ffp$e;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/ffp$e;->a:Ljava/lang/String;

    const-string v2, "input_history_data_tracking_sport_type"

    .line 127
    const/16 v3, 0x102

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/ffp$e;->c:Lo/dcy;

    .line 126
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 128
    iget-object v0, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    const/16 v1, 0x2711

    const/16 v2, 0x102

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 129
    iget-object v0, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 130
    goto/16 :goto_0

    .line 131
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->sporttype_walk:I

    if-ne v5, v0, :cond_1

    .line 132
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    if-eqz v0, :cond_5

    .line 133
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    invoke-virtual {v0}, Lo/ffp;->dismiss()V

    .line 134
    iget-object v0, p0, Lo/ffp$e;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/ffp$e;->a:Ljava/lang/String;

    const-string v2, "input_history_data_tracking_sport_type"

    .line 135
    const/16 v3, 0x101

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/ffp$e;->c:Lo/dcy;

    .line 134
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 136
    iget-object v0, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    const/16 v1, 0x2711

    const/16 v2, 0x101

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 137
    iget-object v0, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 139
    goto/16 :goto_0

    .line 140
    :cond_1
    sget v0, Lcom/huawei/ui/main/R$id;->sporttype_bike:I

    if-ne v5, v0, :cond_2

    .line 141
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    if-eqz v0, :cond_5

    .line 142
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    invoke-virtual {v0}, Lo/ffp;->dismiss()V

    .line 143
    iget-object v0, p0, Lo/ffp$e;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/ffp$e;->a:Ljava/lang/String;

    const-string v2, "input_history_data_tracking_sport_type"

    .line 144
    const/16 v3, 0x103

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/ffp$e;->c:Lo/dcy;

    .line 143
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 145
    iget-object v0, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    const/16 v1, 0x2711

    const/16 v2, 0x103

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 146
    iget-object v0, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 147
    goto/16 :goto_0

    .line 148
    :cond_2
    sget v0, Lcom/huawei/ui/main/R$id;->sporttype_treadmill:I

    if-ne v5, v0, :cond_3

    .line 149
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    if-eqz v0, :cond_5

    .line 150
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    invoke-virtual {v0}, Lo/ffp;->dismiss()V

    .line 151
    iget-object v0, p0, Lo/ffp$e;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/ffp$e;->a:Ljava/lang/String;

    const-string v2, "input_history_data_tracking_sport_type"

    .line 152
    const/16 v3, 0x108

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/ffp$e;->c:Lo/dcy;

    .line 151
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 153
    iget-object v0, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    const/16 v1, 0x2711

    const/16 v2, 0x108

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 154
    iget-object v0, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 155
    goto :goto_0

    .line 156
    :cond_3
    sget v0, Lcom/huawei/ui/main/R$id;->sporttype_swim:I

    if-ne v5, v0, :cond_4

    .line 157
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    if-eqz v0, :cond_5

    .line 158
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    invoke-virtual {v0}, Lo/ffp;->dismiss()V

    .line 159
    iget-object v0, p0, Lo/ffp$e;->e:Landroid/content/Context;

    iget-object v1, p0, Lo/ffp$e;->a:Ljava/lang/String;

    const-string v2, "input_history_data_tracking_sport_type"

    .line 160
    const/16 v3, 0x106

    invoke-static {v3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lo/ffp$e;->c:Lo/dcy;

    .line 159
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 161
    iget-object v0, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    const/16 v1, 0x2711

    const/16 v2, 0x106

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v6

    .line 162
    iget-object v0, p0, Lo/ffp$e;->d:Landroid/os/Handler;

    invoke-virtual {v0, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 163
    goto :goto_0

    .line 164
    :cond_4
    sget v0, Lcom/huawei/ui/main/R$id;->btn_sport_type_input_cancel:I

    if-ne v5, v0, :cond_5

    .line 165
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    if-eqz v0, :cond_5

    .line 166
    iget-object v0, p0, Lo/ffp$e;->b:Lo/ffp;

    invoke-virtual {v0}, Lo/ffp;->dismiss()V

    .line 171
    :cond_5
    :goto_0
    return-void
.end method
