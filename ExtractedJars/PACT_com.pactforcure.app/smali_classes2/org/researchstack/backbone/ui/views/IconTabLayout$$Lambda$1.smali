.class final synthetic Lorg/researchstack/backbone/ui/views/IconTabLayout$$Lambda$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final arg$1:Landroid/support/design/widget/TabLayout$Tab;


# direct methods
.method private constructor <init>(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout$$Lambda$1;->arg$1:Landroid/support/design/widget/TabLayout$Tab;

    return-void
.end method

.method public static lambdaFactory$(Landroid/support/design/widget/TabLayout$Tab;)Landroid/view/View$OnClickListener;
    .locals 1

    new-instance v0, Lorg/researchstack/backbone/ui/views/IconTabLayout$$Lambda$1;

    invoke-direct {v0, p0}, Lorg/researchstack/backbone/ui/views/IconTabLayout$$Lambda$1;-><init>(Landroid/support/design/widget/TabLayout$Tab;)V

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lorg/researchstack/backbone/ui/views/IconTabLayout$$Lambda$1;->arg$1:Landroid/support/design/widget/TabLayout$Tab;

    invoke-static {v0, p1}, Lorg/researchstack/backbone/ui/views/IconTabLayout;->lambda$addIconTab$16(Landroid/support/design/widget/TabLayout$Tab;Landroid/view/View;)V

    return-void
.end method
