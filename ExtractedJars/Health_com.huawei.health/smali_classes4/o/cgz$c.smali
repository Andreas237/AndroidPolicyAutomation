.class public Lo/cgz$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cgz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Landroid/os/Handler;

.field private b:Landroid/content/Context;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Lo/cgz;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;I)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgz$c;->b:Landroid/content/Context;

    .line 47
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgz$c;->e:Lo/cgz;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    .line 52
    const/4 v0, -0x1

    iput v0, p0, Lo/cgz$c;->d:I

    .line 53
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lo/cgz$c;->c:Ljava/util/Map;

    .line 55
    iput-object p1, p0, Lo/cgz$c;->b:Landroid/content/Context;

    .line 56
    iput-object p2, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    .line 57
    iput p3, p0, Lo/cgz$c;->d:I

    .line 58
    return-void
.end method

.method private c(Ljava/util/ArrayList;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/cik;>;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 131
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    .line 132
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 133
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 134
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/cik;

    .line 136
    sget-object v0, Lo/cgz$5;->b:[I

    invoke-virtual {v5}, Lo/cik;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 138
    :pswitch_0
    const-string v6, "\u603b\u8ddd\u79bb"

    .line 139
    goto :goto_2

    .line 141
    :pswitch_1
    const-string v6, "\u603b\u65f6\u95f4"

    .line 142
    goto :goto_2

    .line 144
    :pswitch_2
    const-string v6, "\u901f\u5ea6"

    .line 145
    goto :goto_2

    .line 147
    :pswitch_3
    const-string v6, "\u5361\u8def\u91cc"

    .line 148
    goto :goto_2

    .line 150
    :pswitch_4
    const-string v6, "\u5fc3\u7387"

    .line 151
    goto :goto_2

    .line 153
    :pswitch_5
    const-string v6, "\u6b65\u9891"

    .line 154
    goto :goto_2

    .line 156
    :pswitch_6
    const-string v6, "\u5269\u4f59\u8ddd\u79bb"

    .line 157
    goto :goto_2

    .line 159
    :pswitch_7
    const-string v6, "\u5269\u4f59\u65f6\u95f4"

    .line 160
    goto :goto_2

    .line 162
    :pswitch_8
    const-string v6, "\u5269\u4f59\u5361\u8def\u91cc"

    .line 163
    goto :goto_2

    .line 165
    :pswitch_9
    const-string v6, "\u914d\u901f"

    .line 166
    goto :goto_2

    .line 168
    :goto_1
    const-string v6, ""

    .line 170
    :goto_2
    invoke-static {v5}, Lo/cik;->d(Lo/cik;)I

    move-result v7

    .line 171
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 173
    :cond_0
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method private d(Landroid/util/SparseArray;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Lo/cik;>;)Ljava/util/ArrayList<Lo/cik;>;"
        }
    .end annotation

    .line 118
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 119
    invoke-static {}, Lo/cik;->values()[Lo/cik;

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v3, v0, -0x3

    .line 120
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 121
    invoke-static {}, Lo/cik;->values()[Lo/cik;

    move-result-object v0

    aget-object v0, v0, v4

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 123
    :cond_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v4

    .line 124
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_1

    .line 125
    invoke-virtual {p1, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cik;

    .line 126
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 124
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 128
    :cond_1
    return-object v2
.end method


# virtual methods
.method public a(Landroid/util/SparseArray;)Lo/cgz;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/util/SparseArray<Lo/cik;>;)Lo/cgz;"
        }
    .end annotation

    .line 60
    const/4 v4, 0x0

    .line 61
    iget-object v0, p0, Lo/cgz$c;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/LayoutInflater;

    .line 62
    new-instance v0, Lo/cgz;

    iget-object v1, p0, Lo/cgz$c;->b:Landroid/content/Context;

    sget v2, Lcom/huawei/healthcloud/plugintrack/R$style;->TrackDialog:I

    invoke-direct {v0, v1, v2}, Lo/cgz;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lo/cgz$c;->e:Lo/cgz;

    .line 63
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$layout;->track_select_item_dialog:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    .line 64
    iget-object v0, p0, Lo/cgz$c;->e:Lo/cgz;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4, v1}, Lo/cgz;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    iget-object v0, p0, Lo/cgz$c;->e:Lo/cgz;

    invoke-virtual {v0, v4}, Lo/cgz;->setContentView(Landroid/view/View;)V

    .line 66
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->gridview:I

    invoke-virtual {v4, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/GridView;

    .line 68
    invoke-direct {p0, p1}, Lo/cgz$c;->d(Landroid/util/SparseArray;)Ljava/util/ArrayList;

    move-result-object v7

    .line 69
    invoke-direct {p0, v7}, Lo/cgz$c;->c(Ljava/util/ArrayList;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo/cgz$c;->c:Ljava/util/Map;

    .line 70
    new-instance v8, Lo/chd;

    iget-object v0, p0, Lo/cgz$c;->c:Ljava/util/Map;

    iget-object v1, p0, Lo/cgz$c;->b:Landroid/content/Context;

    invoke-direct {v8, v0, v1, p0}, Lo/chd;-><init>(Ljava/util/Map;Landroid/content/Context;Landroid/view/View$OnClickListener;)V

    .line 71
    invoke-virtual {v6, v8}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 72
    iget-object v0, p0, Lo/cgz$c;->e:Lo/cgz;

    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 76
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    if-nez v0, :cond_0

    .line 77
    iget-object v0, p0, Lo/cgz$c;->e:Lo/cgz;

    invoke-virtual {v0}, Lo/cgz;->dismiss()V

    .line 78
    return-void

    .line 80
    :cond_0
    iget v0, p0, Lo/cgz$c;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 81
    iget-object v0, p0, Lo/cgz$c;->e:Lo/cgz;

    invoke-virtual {v0}, Lo/cgz;->dismiss()V

    .line 82
    return-void

    .line 84
    :cond_1
    const/4 v4, 0x0

    .line 85
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v5

    .line 86
    sget v0, Lcom/huawei/healthcloud/plugintrack/R$id;->pic_id:I

    if-ne v5, v0, :cond_c

    .line 87
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u603b\u8ddd\u79bb"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 88
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    iget v1, p0, Lo/cgz$c;->d:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    goto/16 :goto_0

    .line 89
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u603b\u65f6\u95f4"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 90
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    iget v1, p0, Lo/cgz$c;->d:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    goto/16 :goto_0

    .line 91
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u901f\u5ea6"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 92
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    iget v1, p0, Lo/cgz$c;->d:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    goto/16 :goto_0

    .line 93
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u5361\u8def\u91cc"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 94
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    iget v1, p0, Lo/cgz$c;->d:I

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    goto/16 :goto_0

    .line 95
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u5fc3\u7387"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 96
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    iget v1, p0, Lo/cgz$c;->d:I

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    goto/16 :goto_0

    .line 97
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u6b65\u9891"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 98
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    iget v1, p0, Lo/cgz$c;->d:I

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    goto/16 :goto_0

    .line 99
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u914d\u901f"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 100
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    iget v1, p0, Lo/cgz$c;->d:I

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    goto :goto_0

    .line 101
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u5269\u4f59\u8ddd\u79bb"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 102
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    iget v1, p0, Lo/cgz$c;->d:I

    const/4 v2, 0x7

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    goto :goto_0

    .line 103
    :cond_9
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u5269\u4f59\u65f6\u95f4"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 104
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    iget v1, p0, Lo/cgz$c;->d:I

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    goto :goto_0

    .line 105
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u5269\u4f59\u5361\u8def\u91cc"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 106
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    iget v1, p0, Lo/cgz$c;->d:I

    const/16 v2, 0x9

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    goto :goto_0

    .line 108
    :cond_b
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    iget v1, p0, Lo/cgz$c;->d:I

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v4

    .line 110
    :goto_0
    iget-object v0, p0, Lo/cgz$c;->a:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 113
    :cond_c
    iget-object v0, p0, Lo/cgz$c;->e:Lo/cgz;

    invoke-virtual {v0}, Lo/cgz;->dismiss()V

    .line 114
    return-void
.end method
