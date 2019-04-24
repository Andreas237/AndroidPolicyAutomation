.class Lo/brt$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brt;->d(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/Integer;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:[Ljava/lang/Integer;

.field final synthetic e:[Ljava/lang/Integer;

.field final synthetic f:[Ljava/lang/Integer;

.field final synthetic g:Lo/bui;

.field final synthetic k:Lo/brt;


# direct methods
.method constructor <init>(Lo/brt;II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;Lo/bui;)V
    .locals 0

    .line 605
    iput-object p1, p0, Lo/brt$5;->k:Lo/brt;

    iput p2, p0, Lo/brt$5;->c:I

    iput p3, p0, Lo/brt$5;->b:I

    iput-object p4, p0, Lo/brt$5;->a:[Ljava/lang/Integer;

    iput-object p5, p0, Lo/brt$5;->d:[Ljava/lang/Integer;

    iput-object p6, p0, Lo/brt$5;->e:[Ljava/lang/Integer;

    iput-object p7, p0, Lo/brt$5;->f:[Ljava/lang/Integer;

    iput-object p8, p0, Lo/brt$5;->g:Lo/bui;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 607
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    iget v1, p0, Lo/brt$5;->c:I

    iget v2, p0, Lo/brt$5;->b:I

    mul-int/2addr v1, v2

    iget v2, p0, Lo/brt$5;->b:I

    iget-object v3, p0, Lo/brt$5;->a:[Ljava/lang/Integer;

    iget-object v4, p0, Lo/brt$5;->d:[Ljava/lang/Integer;

    iget-object v5, p0, Lo/brt$5;->e:[Ljava/lang/Integer;

    iget-object v7, p0, Lo/brt$5;->f:[Ljava/lang/Integer;

    new-instance v8, Lo/brt$5$5;

    invoke-direct {v8, p0}, Lo/brt$5$5;-><init>(Lo/brt$5;)V

    const/4 v6, -0x1

    invoke-interface/range {v0 .. v8}, Lo/bsp;->c(II[Ljava/lang/Integer;[Ljava/lang/Integer;[Ljava/lang/Integer;I[Ljava/lang/Integer;Lo/bui;)V

    .line 617
    return-void
.end method
