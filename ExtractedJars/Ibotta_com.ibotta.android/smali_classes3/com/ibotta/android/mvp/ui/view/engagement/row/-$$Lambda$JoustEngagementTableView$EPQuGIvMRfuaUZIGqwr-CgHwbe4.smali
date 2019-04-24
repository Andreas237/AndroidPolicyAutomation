.class public final synthetic Lcom/ibotta/android/mvp/ui/view/engagement/row/-$$Lambda$JoustEngagementTableView$EPQuGIvMRfuaUZIGqwr-CgHwbe4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;

.field private final synthetic f$1:Lcom/ibotta/api/model/OptionModel;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;Lcom/ibotta/api/model/OptionModel;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/-$$Lambda$JoustEngagementTableView$EPQuGIvMRfuaUZIGqwr-CgHwbe4;->f$0:Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/-$$Lambda$JoustEngagementTableView$EPQuGIvMRfuaUZIGqwr-CgHwbe4;->f$1:Lcom/ibotta/api/model/OptionModel;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/-$$Lambda$JoustEngagementTableView$EPQuGIvMRfuaUZIGqwr-CgHwbe4;->f$0:Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/engagement/row/-$$Lambda$JoustEngagementTableView$EPQuGIvMRfuaUZIGqwr-CgHwbe4;->f$1:Lcom/ibotta/api/model/OptionModel;

    invoke-static {v0, v1, p1}, Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;->lambda$onOptionsSet$0(Lcom/ibotta/android/mvp/ui/view/engagement/row/JoustEngagementTableView;Lcom/ibotta/api/model/OptionModel;Landroid/view/View;)V

    return-void
.end method
