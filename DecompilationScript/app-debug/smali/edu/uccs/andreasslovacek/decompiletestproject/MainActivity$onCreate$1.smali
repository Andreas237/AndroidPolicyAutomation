.class final Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$onCreate$1;
.super Ljava/lang/Object;
.source "MainActivity.kt"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "view",
        "Landroid/view/View;",
        "kotlin.jvm.PlatformType",
        "onClick"
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0x7
    }
.end annotation


# static fields
.field public static final INSTANCE:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$onCreate$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$onCreate$1;

    invoke-direct {v0}, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$onCreate$1;-><init>()V

    sput-object v0, Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$onCreate$1;->INSTANCE:Ledu/uccs/andreasslovacek/decompiletestproject/MainActivity$onCreate$1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "view"    # Landroid/view/View;

    .prologue
    .line 45
    const-string/jumbo v0, "Replace with your own action"

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/support/design/widget/Snackbar;->make(Landroid/view/View;Ljava/lang/CharSequence;I)Landroid/support/design/widget/Snackbar;

    move-result-object v1

    .line 46
    const-string/jumbo v0, "Action"

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/support/design/widget/Snackbar;->setAction(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;)Landroid/support/design/widget/Snackbar;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/design/widget/Snackbar;->show()V

    .line 47
    return-void
.end method
