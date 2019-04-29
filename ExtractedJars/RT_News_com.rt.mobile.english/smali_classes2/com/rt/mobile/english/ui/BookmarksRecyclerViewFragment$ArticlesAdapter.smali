.class public Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "BookmarksRecyclerViewFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ArticlesAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field articles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;"
        }
    .end annotation
.end field

.field dateTimeFormatter:Lorg/joda/time/format/DateTimeFormatter;

.field final synthetic this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/rt/mobile/english/data/articles/Article;",
            ">;)V"
        }
    .end annotation

    .line 341
    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;->this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 307
    new-instance p1, Lorg/joda/time/format/DateTimeFormatterBuilder;

    invoke-direct {p1}, Lorg/joda/time/format/DateTimeFormatterBuilder;-><init>()V

    .line 308
    invoke-virtual {p1}, Lorg/joda/time/format/DateTimeFormatterBuilder;->appendMonthOfYearShortText()Lorg/joda/time/format/DateTimeFormatterBuilder;

    move-result-object p1

    const-string v0, " "

    .line 309
    invoke-virtual {p1, v0}, Lorg/joda/time/format/DateTimeFormatterBuilder;->appendLiteral(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatterBuilder;

    move-result-object p1

    const/4 v0, 0x0

    .line 310
    invoke-virtual {p1, v0}, Lorg/joda/time/format/DateTimeFormatterBuilder;->appendDayOfMonth(I)Lorg/joda/time/format/DateTimeFormatterBuilder;

    move-result-object p1

    const-string v0, ", "

    .line 311
    invoke-virtual {p1, v0}, Lorg/joda/time/format/DateTimeFormatterBuilder;->appendLiteral(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatterBuilder;

    move-result-object p1

    .line 312
    invoke-static {}, Lorg/joda/time/format/DateTimeFormat;->shortTime()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/joda/time/format/DateTimeFormatterBuilder;->append(Lorg/joda/time/format/DateTimeFormatter;)Lorg/joda/time/format/DateTimeFormatterBuilder;

    move-result-object p1

    .line 313
    invoke-virtual {p1}, Lorg/joda/time/format/DateTimeFormatterBuilder;->toFormatter()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;->dateTimeFormatter:Lorg/joda/time/format/DateTimeFormatter;

    .line 342
    iput-object p2, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;->articles:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 393
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;->articles:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 304
    check-cast p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;->onBindViewHolder(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;I)V
    .locals 3

    .line 362
    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;->articles:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/rt/mobile/english/data/articles/Article;

    .line 363
    iget-object v0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->textView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 365
    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getTime()Lorg/joda/time/DateTime;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 366
    iget-object v0, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->timeView:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getTime()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-static {v1}, Lcom/rt/mobile/english/Utils;->getStringTime(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 369
    :cond_0
    invoke-static {}, Lcom/rt/mobile/english/Utils;->imageLoader()Lcom/nostra13/universalimageloader/core/ImageLoader;

    move-result-object v0

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getImage()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->imageView:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, v2}, Lcom/nostra13/universalimageloader/core/ImageLoader;->displayImage(Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 384
    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v0, ""

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article;->getVideo()Lcom/rt/mobile/english/data/articles/Article$Video;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/data/articles/Article$Video;->getUrl()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 385
    iget-object p1, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->PlayIcon:Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 387
    :cond_1
    iget-object p1, p1, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;->PlayIcon:Landroid/widget/ImageView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 304
    invoke-virtual {p0, p1, p2}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;
    .locals 2

    .line 349
    invoke-static {}, Lcom/rt/mobile/english/Utils;->getInstance()Lcom/rt/mobile/english/Utils;

    move-result-object p2

    invoke-virtual {p2}, Lcom/rt/mobile/english/Utils;->getPresentation()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;->this$0:Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;

    const v1, 0x7f10011d

    invoke-virtual {v0, v1}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 350
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c002a

    .line 351
    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    .line 353
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0c002d

    .line 354
    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 357
    :goto_0
    new-instance p2, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter$ViewHolder;-><init>(Lcom/rt/mobile/english/ui/BookmarksRecyclerViewFragment$ArticlesAdapter;Landroid/view/View;)V

    return-object p2
.end method
