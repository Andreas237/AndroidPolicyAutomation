.class public Lcom/rt/mobile/english/ui/TypefaceSpan;
.super Landroid/text/style/MetricAffectingSpan;
.source "TypefaceSpan.java"


# static fields
.field private static sTypefaceCache:Landroid/support/v4/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LruCache<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private mTypeface:Landroid/graphics/Typeface;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 13
    new-instance v0, Landroid/support/v4/util/LruCache;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Landroid/support/v4/util/LruCache;-><init>(I)V

    sput-object v0, Lcom/rt/mobile/english/ui/TypefaceSpan;->sTypefaceCache:Landroid/support/v4/util/LruCache;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 21
    invoke-direct {p0}, Landroid/text/style/MetricAffectingSpan;-><init>()V

    .line 22
    sget-object v0, Lcom/rt/mobile/english/ui/TypefaceSpan;->sTypefaceCache:Landroid/support/v4/util/LruCache;

    invoke-virtual {v0, p2}, Landroid/support/v4/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    iput-object v0, p0, Lcom/rt/mobile/english/ui/TypefaceSpan;->mTypeface:Landroid/graphics/Typeface;

    .line 24
    iget-object v0, p0, Lcom/rt/mobile/english/ui/TypefaceSpan;->mTypeface:Landroid/graphics/Typeface;

    if-nez v0, :cond_0

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string v0, "fonts/%s"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 25
    invoke-static {p1, v0}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/rt/mobile/english/ui/TypefaceSpan;->mTypeface:Landroid/graphics/Typeface;

    .line 29
    sget-object p1, Lcom/rt/mobile/english/ui/TypefaceSpan;->sTypefaceCache:Landroid/support/v4/util/LruCache;

    iget-object v0, p0, Lcom/rt/mobile/english/ui/TypefaceSpan;->mTypeface:Landroid/graphics/Typeface;

    invoke-virtual {p1, p2, v0}, Landroid/support/v4/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/rt/mobile/english/ui/TypefaceSpan;->mTypeface:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 46
    invoke-virtual {p1}, Landroid/text/TextPaint;->getFlags()I

    move-result v0

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setFlags(I)V

    return-void
.end method

.method public updateMeasureState(Landroid/text/TextPaint;)V
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/rt/mobile/english/ui/TypefaceSpan;->mTypeface:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 38
    invoke-virtual {p1}, Landroid/text/TextPaint;->getFlags()I

    move-result v0

    or-int/lit16 v0, v0, 0x80

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setFlags(I)V

    return-void
.end method
