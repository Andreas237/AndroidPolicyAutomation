.class Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;
.super Ljava/lang/Object;
.source "CalligraphyLayoutInflater.java"

# interfaces
.implements Landroid/view/LayoutInflater$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "WrapperFactory"
.end annotation


# instance fields
.field private final mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

.field private final mFactory:Landroid/view/LayoutInflater$Factory;

.field private final mInflater:Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater$Factory;Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;Luk/co/chrisjenx/calligraphy/CalligraphyFactory;)V
    .locals 0
    .param p1, "factory"    # Landroid/view/LayoutInflater$Factory;
    .param p2, "inflater"    # Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;
    .param p3, "calligraphyFactory"    # Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    .prologue
    .line 234
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 235
    iput-object p1, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;->mFactory:Landroid/view/LayoutInflater$Factory;

    .line 236
    iput-object p2, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;->mInflater:Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;

    .line 237
    iput-object p3, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;->mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    .line 238
    return-void
.end method


# virtual methods
.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 7
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 242
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 243
    iget-object v6, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;->mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    iget-object v0, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;->mInflater:Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;

    const/4 v1, 0x0

    iget-object v2, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;->mFactory:Landroid/view/LayoutInflater$Factory;

    .line 245
    invoke-interface {v2, p1, p2, p3}, Landroid/view/LayoutInflater$Factory;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    .line 244
    invoke-static/range {v0 .. v5}, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;->access$000(Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater;Landroid/view/View;Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 243
    invoke-virtual {v6, v0, p2, p3}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->onViewCreated(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 250
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;->mCalligraphyFactory:Luk/co/chrisjenx/calligraphy/CalligraphyFactory;

    iget-object v1, p0, Luk/co/chrisjenx/calligraphy/CalligraphyLayoutInflater$WrapperFactory;->mFactory:Landroid/view/LayoutInflater$Factory;

    .line 251
    invoke-interface {v1, p1, p2, p3}, Landroid/view/LayoutInflater$Factory;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v1

    .line 250
    invoke-virtual {v0, v1, p2, p3}, Luk/co/chrisjenx/calligraphy/CalligraphyFactory;->onViewCreated(Landroid/view/View;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method
