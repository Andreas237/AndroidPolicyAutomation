.class Lcom/huawei/ui/openservice/ui/OpenServiceActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->init()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$1;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/OpenServiceActivity$1;->this$0:Lcom/huawei/ui/openservice/ui/OpenServiceActivity;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/OpenServiceActivity;->access$000(Lcom/huawei/ui/openservice/ui/OpenServiceActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->i(Landroid/content/Context;)V

    .line 100
    return-void
.end method
