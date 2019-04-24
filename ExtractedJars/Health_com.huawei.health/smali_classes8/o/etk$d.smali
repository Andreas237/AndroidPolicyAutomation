.class public Lo/etk$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/etk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/graphics/drawable/Drawable;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 240
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 241
    iput-object p1, p0, Lo/etk$d;->b:Landroid/graphics/drawable/Drawable;

    .line 242
    iput-object p2, p0, Lo/etk$d;->e:Ljava/lang/String;

    .line 243
    iput-object p3, p0, Lo/etk$d;->d:Ljava/lang/String;

    .line 244
    iput-object p4, p0, Lo/etk$d;->a:Ljava/lang/String;

    .line 245
    return-void
.end method
