.class Lcom/huawei/feedback/ui/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/feedback/ui/CustomActionBar$a;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackEditActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackEditActivity;)V
    .locals 0

    .line 1058
    iput-object p1, p0, Lcom/huawei/feedback/ui/ad;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1062
    iget-object v0, p0, Lcom/huawei/feedback/ui/ad;->a:Lcom/huawei/feedback/ui/FeedbackEditActivity;

    invoke-virtual {v0}, Lcom/huawei/feedback/ui/FeedbackEditActivity;->onBackPressed()V

    .line 1063
    return-void
.end method
