.class public Lo/dxz;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field c:I

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 29
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    .line 19
    const-string v0, "true"

    iput-object v0, p0, Lo/dxz;->a:Ljava/lang/String;

    .line 21
    const/4 v0, 0x1

    iput v0, p0, Lo/dxz;->c:I

    .line 30
    iput-object p1, p0, Lo/dxz;->d:Landroid/content/Context;

    .line 31
    invoke-direct {p0, p2}, Lo/dxz;->e(I)V

    .line 32
    return-void
.end method

.method private c(Landroid/content/Context;F)I
    .locals 3

    .line 151
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v2, v0, Landroid/util/DisplayMetrics;->density:F

    .line 152
    mul-float v0, p2, v2

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private e(I)V
    .locals 9

    .line 61
    move v3, p1

    .line 62
    const/4 v0, 0x1

    if-ne v3, v0, :cond_0

    .line 63
    const/4 v0, 0x1

    iput v0, p0, Lo/dxz;->c:I

    .line 64
    const-string v0, "true"

    iput-object v0, p0, Lo/dxz;->a:Ljava/lang/String;

    .line 65
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    .line 66
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x42480000    # 50.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v4

    .line 67
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "top"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v5

    .line 69
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "left"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v6

    .line 71
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "right"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v7

    .line 73
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "bottom"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v8

    .line 75
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "end"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    goto/16 :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne v3, v0, :cond_1

    .line 77
    const/4 v0, 0x2

    iput v0, p0, Lo/dxz;->c:I

    .line 78
    const-string v0, "true"

    iput-object v0, p0, Lo/dxz;->a:Ljava/lang/String;

    .line 79
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    .line 80
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x428c0000    # 70.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v4

    .line 81
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "top"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x42300000    # 44.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v5

    .line 83
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "left"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x42300000    # 44.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v6

    .line 85
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "right"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v7

    .line 87
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "bottom"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v8

    .line 89
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "end"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    goto/16 :goto_0

    :cond_1
    const/4 v0, 0x2

    if-le v3, v0, :cond_2

    const/4 v0, 0x5

    if-ge v3, v0, :cond_2

    .line 91
    const/4 v0, 0x2

    iput v0, p0, Lo/dxz;->c:I

    .line 92
    const-string v0, "true"

    iput-object v0, p0, Lo/dxz;->a:Ljava/lang/String;

    .line 93
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    .line 94
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v4

    .line 95
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "top"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x42300000    # 44.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v5

    .line 97
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "left"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x42300000    # 44.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v6

    .line 99
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "right"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41c00000    # 24.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v7

    .line 101
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "bottom"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v8

    .line 103
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "end"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    goto/16 :goto_0

    :cond_2
    const/4 v0, 0x5

    if-eq v3, v0, :cond_3

    const/4 v0, 0x6

    if-ne v3, v0, :cond_4

    .line 105
    :cond_3
    const/4 v0, 0x3

    iput v0, p0, Lo/dxz;->c:I

    .line 106
    const-string v0, "true"

    iput-object v0, p0, Lo/dxz;->a:Ljava/lang/String;

    .line 107
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    .line 108
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x42200000    # 40.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v4

    .line 109
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "top"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v5

    .line 111
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "left"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v6

    .line 113
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "right"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41f00000    # 30.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v7

    .line 115
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "bottom"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v8

    .line 117
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "end"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    goto/16 :goto_0

    :cond_4
    const/4 v0, 0x7

    if-lt v3, v0, :cond_5

    const/16 v0, 0x9

    if-gt v3, v0, :cond_5

    .line 119
    const/4 v0, 0x3

    iput v0, p0, Lo/dxz;->c:I

    .line 120
    const-string v0, "true"

    iput-object v0, p0, Lo/dxz;->a:Ljava/lang/String;

    .line 121
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    .line 122
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v4

    .line 123
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "top"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v5

    .line 125
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "left"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v6

    .line 127
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "right"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v7

    .line 129
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "bottom"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v8

    .line 131
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "end"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    goto/16 :goto_0

    :cond_5
    const/16 v0, 0xa

    if-lt v3, v0, :cond_6

    .line 133
    const/4 v0, 0x3

    iput v0, p0, Lo/dxz;->c:I

    .line 134
    const-string v0, "true"

    iput-object v0, p0, Lo/dxz;->a:Ljava/lang/String;

    .line 135
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    .line 136
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v4

    .line 137
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "top"

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v5

    .line 139
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "left"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41800000    # 16.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v6

    .line 141
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "right"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41400000    # 12.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v7

    .line 143
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "bottom"

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    iget-object v0, p0, Lo/dxz;->d:Landroid/content/Context;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-direct {p0, v0, v1}, Lo/dxz;->c(Landroid/content/Context;F)I

    move-result v8

    .line 145
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "end"

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    :cond_6
    :goto_0
    const-string v0, "PLGACHIEVE_ShareMedalItemDecoration"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "medalCount ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "spanCount ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lo/dxz;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " includeEdge ="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/dxz;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 35
    iget v0, p0, Lo/dxz;->c:I

    return v0
.end method

.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 6

    .line 41
    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView;->getLayoutManager()Landroid/support/v7/widget/RecyclerView$LayoutManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$LayoutManager;->getItemCount()I

    move-result v3

    .line 42
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v4

    .line 43
    iget v0, p0, Lo/dxz;->c:I

    rem-int v5, v4, v0

    .line 45
    iget-object v0, p0, Lo/dxz;->a:Ljava/lang/String;

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 46
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "left"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v2, "left"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    mul-int/2addr v1, v5

    iget v2, p0, Lo/dxz;->c:I

    div-int/2addr v1, v2

    sub-int/2addr v0, v1

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 47
    add-int/lit8 v0, v5, 0x1

    iget-object v1, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v2, "right"

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    mul-int/2addr v0, v1

    iget v1, p0, Lo/dxz;->c:I

    div-int/2addr v0, v1

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 48
    iget v0, p0, Lo/dxz;->c:I

    if-ge v4, v0, :cond_0

    .line 49
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "top"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 51
    :cond_0
    iget v0, p0, Lo/dxz;->c:I

    if-lt v4, v0, :cond_1

    .line 52
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "bottom"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 54
    :cond_1
    iget v0, p0, Lo/dxz;->c:I

    sub-int v0, v3, v0

    if-lt v4, v0, :cond_2

    .line 55
    iget-object v0, p0, Lo/dxz;->b:Ljava/util/HashMap;

    const-string v1, "end"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 58
    :cond_2
    return-void
.end method
