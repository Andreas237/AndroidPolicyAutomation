.class Lo/bgh$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bgh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field a:I

.field b:Lo/bgh$c;

.field c:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Lo/bgh$c;I)V
    .locals 0

    .line 421
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 422
    iput-object p1, p0, Lo/bgh$e;->c:Landroid/graphics/drawable/Drawable;

    .line 423
    iput-object p2, p0, Lo/bgh$e;->b:Lo/bgh$c;

    .line 424
    iput p3, p0, Lo/bgh$e;->a:I

    .line 425
    return-void
.end method
