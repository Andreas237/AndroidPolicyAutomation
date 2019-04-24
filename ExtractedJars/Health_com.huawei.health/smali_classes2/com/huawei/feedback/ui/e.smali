.class Lcom/huawei/feedback/ui/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V
    .locals 0

    .line 280
    iput-object p1, p0, Lcom/huawei/feedback/ui/e;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 1

    .line 291
    iget-object v0, p0, Lcom/huawei/feedback/ui/e;->a:Lcom/huawei/feedback/ui/FeedbackDetailActivity;

    invoke-static {v0}, Lcom/huawei/feedback/ui/FeedbackDetailActivity;->c(Lcom/huawei/feedback/ui/FeedbackDetailActivity;)V

    .line 292
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 287
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 283
    return-void
.end method
