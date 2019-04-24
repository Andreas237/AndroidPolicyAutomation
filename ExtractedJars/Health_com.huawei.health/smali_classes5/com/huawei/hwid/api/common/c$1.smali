.class Lcom/huawei/hwid/api/common/c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwid/api/common/c;-><init>(Landroid/app/Activity;Landroid/net/Uri;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwid/api/common/c;


# direct methods
.method constructor <init>(Lcom/huawei/hwid/api/common/c;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/hwid/api/common/c$1;->a:Lcom/huawei/hwid/api/common/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 42
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    .line 44
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c$1;->a:Lcom/huawei/hwid/api/common/c;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/c;->a(Lcom/huawei/hwid/api/common/c;)V

    .line 45
    goto :goto_0

    .line 47
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c$1;->a:Lcom/huawei/hwid/api/common/c;

    invoke-static {v0}, Lcom/huawei/hwid/api/common/c;->b(Lcom/huawei/hwid/api/common/c;)V

    .line 48
    goto :goto_0

    .line 50
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/hwid/api/common/c$1;->a:Lcom/huawei/hwid/api/common/c;

    invoke-virtual {v0}, Lcom/huawei/hwid/api/common/c;->a()V

    .line 51
    .line 55
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
