.class public final synthetic Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$L7po9HOytHZURlanozth3UeN6NE;
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

    iput-object p1, p0, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$L7po9HOytHZURlanozth3UeN6NE;->f$0:Landroid/widget/ScrollView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/more/-$$Lambda$ReportWalkinProblemScreen$L7po9HOytHZURlanozth3UeN6NE;->f$0:Landroid/widget/ScrollView;

    invoke-static {v0}, Lcom/shopkick/app/more/ReportWalkinProblemScreen;->lambda$showSecondSection$125(Landroid/widget/ScrollView;)V

    return-void
.end method
