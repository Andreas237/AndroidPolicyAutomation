.class public final synthetic Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$10tCtYkGiFCSFS92eAEh9TRrJ4U;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Landroid/widget/ScrollView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ScrollView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$10tCtYkGiFCSFS92eAEh9TRrJ4U;->f$0:Landroid/widget/ScrollView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$10tCtYkGiFCSFS92eAEh9TRrJ4U;->f$0:Landroid/widget/ScrollView;

    invoke-static {v0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->lambda$maybeShowThirdSection$127(Landroid/widget/ScrollView;)V

    return-void
.end method
