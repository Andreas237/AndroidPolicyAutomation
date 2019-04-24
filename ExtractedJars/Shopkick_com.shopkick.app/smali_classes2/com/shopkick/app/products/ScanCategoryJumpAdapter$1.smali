.class Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;
.super Ljava/lang/Object;
.source "ScanCategoryJumpAdapter.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/ScanCategoryJumpAdapter;->setCategoryInfos(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;",
        ">;"
    }
.end annotation


# instance fields
.field private final sortOverrideMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/ScanCategoryJumpAdapter;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;->this$0:Lcom/shopkick/app/products/ScanCategoryJumpAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    new-instance p1, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1$1;-><init>(Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;)V

    iput-object p1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;->sortOverrideMap:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;)I
    .locals 3

    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;->sortOverrideMap:Ljava/util/HashMap;

    iget-object v2, p1, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->productHierarchyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->categoryName:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;->sortOverrideMap:Ljava/util/HashMap;

    iget-object v2, p2, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->productHierarchyId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p2, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;->categoryName:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 153
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 130
    check-cast p1, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;

    check-cast p2, Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/products/ScanCategoryJumpAdapter$1;->compare(Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;Lcom/shopkick/app/products/CategoryJumperController$CategoryInfo;)I

    move-result p1

    return p1
.end method
