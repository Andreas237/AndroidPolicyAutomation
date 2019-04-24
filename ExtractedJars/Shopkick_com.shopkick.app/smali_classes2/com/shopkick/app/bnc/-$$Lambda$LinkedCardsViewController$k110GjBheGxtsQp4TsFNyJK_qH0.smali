.class public final synthetic Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$k110GjBheGxtsQp4TsFNyJK_qH0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/bnc/LinkedCardsViewController;

.field private final synthetic f$1:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$k110GjBheGxtsQp4TsFNyJK_qH0;->f$0:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    iput-object p2, p0, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$k110GjBheGxtsQp4TsFNyJK_qH0;->f$1:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$k110GjBheGxtsQp4TsFNyJK_qH0;->f$0:Lcom/shopkick/app/bnc/LinkedCardsViewController;

    iget-object v1, p0, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$k110GjBheGxtsQp4TsFNyJK_qH0;->f$1:Ljava/util/ArrayList;

    invoke-static {v0, v1, p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->lambda$handleDeleteCardsResponse$32(Lcom/shopkick/app/bnc/LinkedCardsViewController;Ljava/util/ArrayList;Landroid/view/View;)V

    return-void
.end method
