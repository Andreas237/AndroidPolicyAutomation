.class public Lo/chj$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/chj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 217
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 218
    iput-object p1, p0, Lo/chj$b;->e:Landroid/graphics/drawable/Drawable;

    .line 219
    iput-object p2, p0, Lo/chj$b;->b:Ljava/lang/String;

    .line 220
    iput-object p3, p0, Lo/chj$b;->c:Ljava/lang/String;

    .line 221
    iput-object p4, p0, Lo/chj$b;->d:Ljava/lang/String;

    .line 222
    return-void
.end method
