.class Lo/faj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/faj;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/SleepTotalData;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lo/faj;


# direct methods
.method constructor <init>(Lo/faj;I)V
    .locals 0

    .line 365
    iput-object p1, p0, Lo/faj$4;->c:Lo/faj;

    iput p2, p0, Lo/faj$4;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 367
    iget-object v0, p0, Lo/faj$4;->c:Lo/faj;

    iget v1, p0, Lo/faj$4;->b:I

    invoke-static {v0, v1}, Lo/faj;->d(Lo/faj;I)V

    .line 368
    return-void
.end method
