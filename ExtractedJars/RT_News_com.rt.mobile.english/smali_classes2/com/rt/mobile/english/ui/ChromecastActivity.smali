.class public Lcom/rt/mobile/english/ui/ChromecastActivity;
.super Landroid/support/v7/app/AppCompatActivity;
.source "ChromecastActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field chromeCast:Lcom/rt/mobile/english/ui/widget/ChromeCast;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field playPauseButton:Landroid/widget/ImageView;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090122
    .end annotation
.end field

.field toolbar:Landroid/support/v7/widget/Toolbar;
    .annotation build Lbutterknife/InjectView;
        value = 0x7f090196
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Landroid/support/v7/app/AppCompatActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 54
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChromecastActivity;->chromeCast:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->isPlaying()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 55
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChromecastActivity;->playPauseButton:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChromecastActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0801c3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 56
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChromecastActivity;->chromeCast:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->pause()V

    goto :goto_0

    .line 58
    :cond_0
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChromecastActivity;->playPauseButton:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChromecastActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0801c2

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 59
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChromecastActivity;->chromeCast:Lcom/rt/mobile/english/ui/widget/ChromeCast;

    invoke-virtual {p1}, Lcom/rt/mobile/english/ui/widget/ChromeCast;->play()V

    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 40
    invoke-super {p0, p1}, Landroid/support/v7/app/AppCompatActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0032

    .line 41
    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ChromecastActivity;->setContentView(I)V

    .line 43
    invoke-static {p0}, Lcom/rt/mobile/english/RTApp;->get(Landroid/content/Context;)Lcom/rt/mobile/english/RTApp;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/rt/mobile/english/RTApp;->inject(Ljava/lang/Object;)V

    .line 44
    invoke-static {p0}, Lbutterknife/ButterKnife;->inject(Landroid/app/Activity;)V

    .line 46
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChromecastActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    invoke-virtual {p0, p1}, Lcom/rt/mobile/english/ui/ChromecastActivity;->setSupportActionBar(Landroid/support/v7/widget/Toolbar;)V

    .line 47
    invoke-virtual {p0}, Lcom/rt/mobile/english/ui/ChromecastActivity;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 49
    iget-object p1, p0, Lcom/rt/mobile/english/ui/ChromecastActivity;->playPauseButton:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected onStart()V
    .locals 0

    .line 35
    invoke-super {p0}, Landroid/support/v7/app/AppCompatActivity;->onStart()V

    return-void
.end method
