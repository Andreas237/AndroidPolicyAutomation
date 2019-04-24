.class public Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;
.super Ljava/lang/Object;
.source "CategoryJumperController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/CategoryJumperController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "CategoryInfo"
.end annotation


# instance fields
.field public categoryName:Ljava/lang/String;

.field public listPosition:I

.field public numScans:I

.field public productHierarchyId:Ljava/lang/String;

.field public skLink:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/products/CategoryJumperController;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/products/CategoryJumperController;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 107
    iput p1, p0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->numScans:I

    .line 110
    iput-object p2, p0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->categoryName:Ljava/lang/String;

    .line 111
    iput-object p3, p0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->productHierarchyId:Ljava/lang/String;

    .line 112
    iput p4, p0, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->listPosition:I

    return-void
.end method
