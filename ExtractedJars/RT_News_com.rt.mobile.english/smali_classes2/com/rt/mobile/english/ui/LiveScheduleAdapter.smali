.class public final Lcom/rt/mobile/english/ui/LiveScheduleAdapter;
.super Landroid/widget/BaseAdapter;
.source "LiveScheduleAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;
    }
.end annotation


# instance fields
.field private FIRST_VISIBLE_ITEM:I

.field private FRAME_ID:I

.field private TAG:Ljava/lang/String;

.field private act:Landroid/content/Context;

.field private calculated:Z

.field private final data:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/channels/ScheduleItem;",
            ">;"
        }
    .end annotation
.end field

.field private firstVisibleItemPosition:I

.field private final inflater:Landroid/view/LayoutInflater;

.field private itemHeight:I

.field private liveWasShown:Z

.field private previousProgramsCount:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/channels/ScheduleItem;",
            ">;)V"
        }
    .end annotation

    .line 40
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    const-string v0, "LiveScheduleAdapter"

    .line 29
    iput-object v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->TAG:Ljava/lang/String;

    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->liveWasShown:Z

    const/4 v1, 0x1

    .line 31
    iput v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->FRAME_ID:I

    const/4 v1, 0x2

    .line 32
    iput v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->FIRST_VISIBLE_ITEM:I

    .line 33
    iput v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->firstVisibleItemPosition:I

    .line 34
    iput v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->itemHeight:I

    .line 35
    iput v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->previousProgramsCount:I

    .line 36
    iput-boolean v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->calculated:Z

    .line 41
    iput-object p2, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->data:Ljava/util/List;

    const-string p2, "layout_inflater"

    .line 42
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/LayoutInflater;

    iput-object p2, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->inflater:Landroid/view/LayoutInflater;

    .line 43
    iput-object p1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    return-void
.end method

.method private calculatePreviousProgramsCount()V
    .locals 4

    .line 68
    iget-object v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->data:Ljava/util/List;

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 70
    :cond_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getMethodName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "previousProgramsCount = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->previousProgramsCount:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", data.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->data:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    iget v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->previousProgramsCount:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iget-object v3, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->data:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 72
    iget-object v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->data:Ljava/util/List;

    iget v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->previousProgramsCount:I

    add-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/data/channels/ScheduleItem;

    .line 73
    :cond_1
    iget v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->previousProgramsCount:I

    add-int/2addr v1, v2

    iput v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->previousProgramsCount:I

    if-eqz v0, :cond_2

    .line 74
    invoke-virtual {v0}, Lcom/rt/mobile/english/data/channels/ScheduleItem;->getDate()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->mustShown(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 75
    :cond_2
    iget v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->previousProgramsCount:I

    sub-int/2addr v0, v2

    iput v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->previousProgramsCount:I

    .line 76
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->notifyDataSetChanged()V

    .line 77
    iput-boolean v2, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->calculated:Z

    :cond_3
    return-void
.end method

.method private getLocalTime(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 134
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd\'T\'HHmmss"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "Etc/UTC"

    .line 135
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 137
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "HH:mm"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 142
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 144
    invoke-static {p1}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 146
    :goto_0
    invoke-virtual {v1, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private mustShown(Ljava/lang/String;)Z
    .locals 4

    .line 151
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd\'T\'HHmmss"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v1, "Etc/UTC"

    .line 152
    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 156
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 158
    invoke-static {p1}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 160
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_1
    return p1
.end method


# virtual methods
.method public getCount()I
    .locals 2

    .line 48
    iget-boolean v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->calculated:Z

    if-nez v0, :cond_0

    .line 49
    invoke-direct {p0}, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->calculatePreviousProgramsCount()V

    .line 52
    :cond_0
    iget-object v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->data:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 53
    iget-object v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->data:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->previousProgramsCount:I

    sub-int/2addr v0, v1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 2

    .line 63
    iget-object v0, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->data:Ljava/util/List;

    iget v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->previousProgramsCount:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    .line 88
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/rt/mobile/english/data/channels/ScheduleItem;

    .line 90
    new-instance v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;-><init>(Lcom/rt/mobile/english/ui/LiveScheduleAdapter$1;)V

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    .line 91
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v3

    iget v4, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->FRAME_ID:I

    if-eq v3, v4, :cond_0

    goto :goto_0

    .line 105
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;

    goto/16 :goto_1

    .line 92
    :cond_1
    :goto_0
    iget-object p2, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->inflater:Landroid/view/LayoutInflater;

    const v3, 0x7f0c0061

    invoke-virtual {p2, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    const v1, 0x7f090190

    .line 93
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->time:Landroid/widget/TextView;

    const v1, 0x7f090191

    .line 94
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->title:Landroid/widget/TextView;

    const v1, 0x7f0900cb

    .line 95
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->live:Landroid/widget/TextView;

    const v1, 0x7f09013d

    .line 96
    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    iput-object v1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->rl:Landroid/widget/RelativeLayout;

    .line 97
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 98
    iget-object v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f0700ec

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iget-object v4, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {p2, v2, v1, v2, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 99
    iget v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->itemHeight:I

    if-nez v1, :cond_2

    .line 100
    iget-object v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/high16 v4, 0x40000000    # 2.0f

    mul-float/2addr v1, v4

    float-to-int v1, v1

    iget-object v5, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->title:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getTextSize()F

    move-result v5

    float-to-int v5, v5

    add-int/2addr v1, v5

    add-int/lit8 v1, v1, 0x5

    iput v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->itemHeight:I

    .line 101
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object v1

    invoke-virtual {v1}, Lcom/rt/mobile/english/Utils;->getLocaleVersion()Lcom/rt/mobile/english/Utils$EditionEnum;

    move-result-object v1

    sget-object v5, Lcom/rt/mobile/english/Utils$EditionEnum;->ES:Lcom/rt/mobile/english/Utils$EditionEnum;

    if-ne v1, v5, :cond_2

    .line 102
    iget-object v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    mul-float/2addr v1, v4

    float-to-int v1, v1

    iget-object v3, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->title:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTextSize()F

    move-result v3

    float-to-int v3, v3

    add-int/2addr v1, v3

    add-int/lit8 v1, v1, 0x6

    iput v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->itemHeight:I

    .line 107
    :cond_2
    :goto_1
    iget-object v1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->time:Landroid/widget/TextView;

    invoke-virtual {p3}, Lcom/rt/mobile/english/data/channels/ScheduleItem;->getDate()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->getLocalTime(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    iget-object v1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->title:Landroid/widget/TextView;

    invoke-virtual {p3}, Lcom/rt/mobile/english/data/channels/ScheduleItem;->getTitle()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-boolean p3, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->liveWasShown:Z

    if-eqz p3, :cond_4

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result p3

    iget v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->FIRST_VISIBLE_ITEM:I

    if-eq p3, v1, :cond_4

    iget p3, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->firstVisibleItemPosition:I

    if-ne p1, p3, :cond_3

    goto :goto_2

    .line 124
    :cond_3
    iget-object p1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->time:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    const-string v1, "Roboto-Regular.ttf"

    invoke-static {p3, v1}, Lcom/rt/mobile/english/ui/Typefaces;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 125
    iget-object p1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->live:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    const-string v1, "Roboto-Regular.ttf"

    invoke-static {p3, v1}, Lcom/rt/mobile/english/ui/Typefaces;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 126
    iget-object p1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->title:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    const-string v1, "Roboto-Regular.ttf"

    invoke-static {p3, v1}, Lcom/rt/mobile/english/ui/Typefaces;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 127
    iget-object p1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->live:Landroid/widget/TextView;

    const/16 p3, 0x8

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 128
    iget p1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->FRAME_ID:I

    invoke-virtual {p2, p1}, Landroid/view/View;->setId(I)V

    goto/16 :goto_3

    .line 111
    :cond_4
    :goto_2
    iget-object p3, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->live:Landroid/widget/TextView;

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 p3, 0x1

    .line 112
    iput-boolean p3, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->liveWasShown:Z

    .line 113
    iget v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->FIRST_VISIBLE_ITEM:I

    invoke-virtual {p2, v1}, Landroid/view/View;->setId(I)V

    .line 114
    iput p1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->firstVisibleItemPosition:I

    .line 115
    iget-object p1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "holder.rl = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->rl:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    iget-object p1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->rl:Landroid/widget/RelativeLayout;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060032

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 118
    iget-object p1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->time:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    const-string v2, "Roboto-Medium.ttf"

    invoke-static {v1, v2}, Lcom/rt/mobile/english/ui/Typefaces;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {p1, v1, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 119
    iget-object p1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->live:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    const-string v2, "Roboto-Medium.ttf"

    invoke-static {v1, v2}, Lcom/rt/mobile/english/ui/Typefaces;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {p1, v1, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 120
    iget-object p1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->title:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    const-string v2, "Roboto-Medium.ttf"

    invoke-static {v1, v2}, Lcom/rt/mobile/english/ui/Typefaces;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {p1, v1, p3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 121
    iget-object p1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->time:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v1, 0x7f060077

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 122
    iget-object p1, v0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter$ViewHolder;->title:Landroid/widget/TextView;

    iget-object p3, p0, Lcom/rt/mobile/english/ui/LiveScheduleAdapter;->act:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_3
    return-object p2
.end method
