.class public Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;
.super Landroid/widget/BaseAdapter;
.source "SimpleSectionAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mobsandgeeks/adapters/SimpleSectionAdapter$SectionHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/widget/BaseAdapter;"
    }
.end annotation


# static fields
.field static final DEBUG:Z = false

.field static final TAG:Ljava/lang/String; = "SimpleSectionAdapter"

.field private static final VIEW_TYPE_SECTION_HEADER:I


# instance fields
.field private context:Landroid/content/Context;

.field private listAdapter:Landroid/widget/BaseAdapter;

.field private sectionHeaderLayoutId:I

.field private sectionTitleTextViewId:I

.field private sectionizer:Lcom/mobsandgeeks/adapters/Sectionizer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/mobsandgeeks/adapters/Sectionizer<",
            "TT;>;"
        }
    .end annotation
.end field

.field private sections:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/widget/BaseAdapter;IILcom/mobsandgeeks/adapters/Sectionizer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/widget/BaseAdapter;",
            "II",
            "Lcom/mobsandgeeks/adapters/Sectionizer<",
            "TT;>;)V"
        }
    .end annotation

    .line 65
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    if-eqz p5, :cond_1

    .line 74
    invoke-direct {p0, p1, p3, p4}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->isTextView(Landroid/content/Context;II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    iput-object p1, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->context:Landroid/content/Context;

    .line 79
    iput-object p2, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    .line 80
    iput p3, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sectionHeaderLayoutId:I

    .line 81
    iput p4, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sectionTitleTextViewId:I

    .line 82
    iput-object p5, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sectionizer:Lcom/mobsandgeeks/adapters/Sectionizer;

    .line 83
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sections:Ljava/util/LinkedHashMap;

    .line 86
    invoke-direct {p0}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->findSections()V

    return-void

    .line 75
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "sectionTitleTextViewId should be a TextView."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 73
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "sectionizer cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 71
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "listAdapter cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 69
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "context cannot be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private findSections()V
    .locals 6

    .line 200
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->getCount()I

    move-result v0

    .line 202
    iget-object v1, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sections:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-lt v1, v0, :cond_0

    return-void

    .line 206
    :cond_0
    iget-object v3, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sectionizer:Lcom/mobsandgeeks/adapters/Sectionizer;

    .line 207
    iget-object v4, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {v4, v1}, Landroid/widget/BaseAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v4

    .line 206
    invoke-interface {v3, v4}, Lcom/mobsandgeeks/adapters/Sectionizer;->getSectionTitleForItem(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 209
    iget-object v4, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sections:Ljava/util/LinkedHashMap;

    invoke-virtual {v4, v3}, Ljava/util/LinkedHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 210
    iget-object v4, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sections:Ljava/util/LinkedHashMap;

    add-int v5, v1, v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private getSectionCount()I
    .locals 1

    .line 221
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sections:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    return v0
.end method

.method private isTextView(Landroid/content/Context;II)Z
    .locals 1

    const/4 v0, 0x0

    .line 90
    invoke-static {p1, p2, v0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    .line 91
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 93
    instance-of p1, p1, Landroid/widget/TextView;

    return p1
.end method

.method private sectionTitleForPosition(I)Ljava/lang/String;
    .locals 3

    .line 227
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sections:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 228
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 229
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_0

    .line 230
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 2

    .line 136
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->areAllItemsEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sections:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public getCount()I
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->getCount()I

    move-result v0

    invoke-direct {p0}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->getSectionCount()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public getIndexForPosition(I)I
    .locals 3

    .line 185
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sections:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 186
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    sub-int/2addr p1, v1

    return p1

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 187
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ge v2, p1, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {p0, p1}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->getIndexForPosition(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/BaseAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    .line 166
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {p0, p1}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->getIndexForPosition(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/BaseAdapter;->getItemId(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 2

    .line 142
    invoke-virtual {p0, p1}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->getIndexForPosition(I)I

    move-result v0

    .line 143
    iget-object v1, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sections:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 145
    :cond_0
    iget-object p1, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {p1, v0}, Landroid/widget/BaseAdapter;->getItemViewType(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    :goto_0
    return p1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 106
    invoke-virtual {p0, p1}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {p0, p1}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->getIndexForPosition(I)I

    move-result v2

    invoke-virtual {v0, v2, p2, p3}, Landroid/widget/BaseAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    .line 109
    iget-object p2, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->context:Landroid/content/Context;

    iget p3, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sectionHeaderLayoutId:I

    invoke-static {p2, p3, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 111
    new-instance v1, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter$SectionHolder;

    invoke-direct {v1}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter$SectionHolder;-><init>()V

    .line 112
    iget p3, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sectionTitleTextViewId:I

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, v1, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter$SectionHolder;->titleTextView:Landroid/widget/TextView;

    .line 114
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 116
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    move-object v1, p3

    check-cast v1, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter$SectionHolder;

    :goto_0
    if-eqz v1, :cond_2

    .line 127
    invoke-direct {p0, p1}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sectionTitleForPosition(I)Ljava/lang/String;

    move-result-object p1

    .line 128
    iget-object p3, v1, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter$SectionHolder;->titleTextView:Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-object p2
.end method

.method public getViewTypeCount()I
    .locals 1

    .line 150
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->getViewTypeCount()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public isEnabled(I)Z
    .locals 2

    .line 155
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->sections:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {p0, p1}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->getIndexForPosition(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/BaseAdapter;->isEnabled(I)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public notifyDataSetChanged()V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->listAdapter:Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 172
    invoke-direct {p0}, Lcom/mobsandgeeks/adapters/SimpleSectionAdapter;->findSections()V

    .line 173
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
