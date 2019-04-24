.class public Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewHolder2"
.end annotation


# instance fields
.field et:Landroid/widget/EditText;

.field tvTitle:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEt()Landroid/widget/EditText;
    .locals 1

    .line 247
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder2;->et:Landroid/widget/EditText;

    return-object v0
.end method

.method public getTvTitle()Landroid/widget/TextView;
    .locals 1

    .line 243
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder2;->tvTitle:Landroid/widget/TextView;

    return-object v0
.end method
