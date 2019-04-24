.class final Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1676
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)[Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 1

    .line 1679
    new-array v0, p1, [Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .line 1676
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability$5;->d(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Parcel;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 108

    .line 1686
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 1688
    :goto_0
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 1690
    :goto_1
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    .line 1692
    :goto_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    const/4 v5, 0x1

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    .line 1694
    :goto_3
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    const/4 v6, 0x1

    goto :goto_4

    :cond_4
    const/4 v6, 0x0

    .line 1696
    :goto_4
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    const/4 v7, 0x1

    goto :goto_5

    :cond_5
    const/4 v7, 0x0

    .line 1698
    :goto_5
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    const/4 v8, 0x1

    goto :goto_6

    :cond_6
    const/4 v8, 0x0

    .line 1700
    :goto_6
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    const/4 v9, 0x1

    goto :goto_7

    :cond_7
    const/4 v9, 0x0

    .line 1702
    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    const/4 v10, 0x1

    goto :goto_8

    :cond_8
    const/4 v10, 0x0

    .line 1704
    :goto_8
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    const/4 v11, 0x1

    goto :goto_9

    :cond_9
    const/4 v11, 0x0

    .line 1706
    :goto_9
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_a

    const/4 v12, 0x1

    goto :goto_a

    :cond_a
    const/4 v12, 0x0

    .line 1708
    :goto_a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_b

    const/4 v13, 0x1

    goto :goto_b

    :cond_b
    const/4 v13, 0x0

    .line 1712
    :goto_b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    const/4 v14, 0x1

    goto :goto_c

    :cond_c
    const/4 v14, 0x0

    .line 1714
    :goto_c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_d

    const/4 v15, 0x1

    goto :goto_d

    :cond_d
    const/4 v15, 0x0

    .line 1716
    :goto_d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_e

    const/16 v16, 0x1

    goto :goto_e

    :cond_e
    const/16 v16, 0x0

    .line 1718
    :goto_e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_f

    const/16 v17, 0x1

    goto :goto_f

    :cond_f
    const/16 v17, 0x0

    .line 1720
    :goto_f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_10

    const/16 v18, 0x1

    goto :goto_10

    :cond_10
    const/16 v18, 0x0

    .line 1724
    :goto_10
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_11

    const/16 v19, 0x1

    goto :goto_11

    :cond_11
    const/16 v19, 0x0

    .line 1728
    :goto_11
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_12

    const/16 v20, 0x1

    goto :goto_12

    :cond_12
    const/16 v20, 0x0

    .line 1736
    :goto_12
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v21

    .line 1738
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v22

    .line 1740
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_13

    const/16 v23, 0x1

    goto :goto_13

    :cond_13
    const/16 v23, 0x0

    .line 1742
    :goto_13
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_14

    const/16 v24, 0x1

    goto :goto_14

    :cond_14
    const/16 v24, 0x0

    .line 1744
    :goto_14
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_15

    const/16 v25, 0x1

    goto :goto_15

    :cond_15
    const/16 v25, 0x0

    .line 1746
    :goto_15
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_16

    const/16 v26, 0x1

    goto :goto_16

    :cond_16
    const/16 v26, 0x0

    .line 1748
    :goto_16
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_17

    const/16 v27, 0x1

    goto :goto_17

    :cond_17
    const/16 v27, 0x0

    .line 1750
    :goto_17
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_18

    const/16 v28, 0x1

    goto :goto_18

    :cond_18
    const/16 v28, 0x0

    .line 1753
    :goto_18
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_19

    const/16 v29, 0x1

    goto :goto_19

    :cond_19
    const/16 v29, 0x0

    .line 1756
    :goto_19
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1a

    const/16 v30, 0x1

    goto :goto_1a

    :cond_1a
    const/16 v30, 0x0

    .line 1759
    :goto_1a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1b

    const/16 v31, 0x1

    goto :goto_1b

    :cond_1b
    const/16 v31, 0x0

    .line 1762
    :goto_1b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1c

    const/16 v32, 0x1

    goto :goto_1c

    :cond_1c
    const/16 v32, 0x0

    .line 1766
    :goto_1c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1d

    const/16 v33, 0x1

    goto :goto_1d

    :cond_1d
    const/16 v33, 0x0

    .line 1768
    :goto_1d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v34

    .line 1770
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1e

    const/16 v35, 0x1

    goto :goto_1e

    :cond_1e
    const/16 v35, 0x0

    .line 1774
    :goto_1e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1f

    const/16 v36, 0x1

    goto :goto_1f

    :cond_1f
    const/16 v36, 0x0

    .line 1778
    :goto_1f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_20

    const/16 v37, 0x1

    goto :goto_20

    :cond_20
    const/16 v37, 0x0

    .line 1780
    :goto_20
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_21

    const/16 v38, 0x1

    goto :goto_21

    :cond_21
    const/16 v38, 0x0

    .line 1782
    :goto_21
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_22

    const/16 v39, 0x1

    goto :goto_22

    :cond_22
    const/16 v39, 0x0

    .line 1786
    :goto_22
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_23

    const/16 v40, 0x1

    goto :goto_23

    :cond_23
    const/16 v40, 0x0

    .line 1788
    :goto_23
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_24

    const/16 v41, 0x1

    goto :goto_24

    :cond_24
    const/16 v41, 0x0

    .line 1792
    :goto_24
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_25

    const/16 v42, 0x1

    goto :goto_25

    :cond_25
    const/16 v42, 0x0

    .line 1800
    :goto_25
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_26

    const/16 v43, 0x1

    goto :goto_26

    :cond_26
    const/16 v43, 0x0

    .line 1802
    :goto_26
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_27

    const/16 v44, 0x1

    goto :goto_27

    :cond_27
    const/16 v44, 0x0

    .line 1818
    :goto_27
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_28

    const/16 v45, 0x1

    goto :goto_28

    :cond_28
    const/16 v45, 0x0

    .line 1820
    :goto_28
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_29

    const/16 v46, 0x1

    goto :goto_29

    :cond_29
    const/16 v46, 0x0

    .line 1822
    :goto_29
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2a

    const/16 v47, 0x1

    goto :goto_2a

    :cond_2a
    const/16 v47, 0x0

    .line 1826
    :goto_2a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2b

    const/16 v48, 0x1

    goto :goto_2b

    :cond_2b
    const/16 v48, 0x0

    .line 1828
    :goto_2b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2c

    const/16 v49, 0x1

    goto :goto_2c

    :cond_2c
    const/16 v49, 0x0

    .line 1830
    :goto_2c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2d

    const/16 v50, 0x1

    goto :goto_2d

    :cond_2d
    const/16 v50, 0x0

    .line 1832
    :goto_2d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2e

    const/16 v51, 0x1

    goto :goto_2e

    :cond_2e
    const/16 v51, 0x0

    .line 1834
    :goto_2e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2f

    const/16 v52, 0x1

    goto :goto_2f

    :cond_2f
    const/16 v52, 0x0

    .line 1836
    :goto_2f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_30

    const/16 v53, 0x1

    goto :goto_30

    :cond_30
    const/16 v53, 0x0

    .line 1839
    :goto_30
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_31

    const/16 v54, 0x1

    goto :goto_31

    :cond_31
    const/16 v54, 0x0

    .line 1841
    :goto_31
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_32

    const/16 v55, 0x1

    goto :goto_32

    :cond_32
    const/16 v55, 0x0

    .line 1844
    :goto_32
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_33

    const/16 v56, 0x1

    goto :goto_33

    :cond_33
    const/16 v56, 0x0

    .line 1846
    :goto_33
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_34

    const/16 v57, 0x1

    goto :goto_34

    :cond_34
    const/16 v57, 0x0

    .line 1850
    :goto_34
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_35

    const/16 v58, 0x1

    goto :goto_35

    :cond_35
    const/16 v58, 0x0

    .line 1854
    :goto_35
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_36

    const/16 v59, 0x1

    goto :goto_36

    :cond_36
    const/16 v59, 0x0

    .line 1856
    :goto_36
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_37

    const/16 v60, 0x1

    goto :goto_37

    :cond_37
    const/16 v60, 0x0

    .line 1858
    :goto_37
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_38

    const/16 v61, 0x1

    goto :goto_38

    :cond_38
    const/16 v61, 0x0

    .line 1860
    :goto_38
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_39

    const/16 v62, 0x1

    goto :goto_39

    :cond_39
    const/16 v62, 0x0

    .line 1862
    :goto_39
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3a

    const/16 v63, 0x1

    goto :goto_3a

    :cond_3a
    const/16 v63, 0x0

    .line 1864
    :goto_3a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3b

    const/16 v64, 0x1

    goto :goto_3b

    :cond_3b
    const/16 v64, 0x0

    .line 1866
    :goto_3b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3c

    const/16 v65, 0x1

    goto :goto_3c

    :cond_3c
    const/16 v65, 0x0

    .line 1868
    :goto_3c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3d

    const/16 v66, 0x1

    goto :goto_3d

    :cond_3d
    const/16 v66, 0x0

    .line 1870
    :goto_3d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3e

    const/16 v67, 0x1

    goto :goto_3e

    :cond_3e
    const/16 v67, 0x0

    .line 1872
    :goto_3e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3f

    const/16 v68, 0x1

    goto :goto_3f

    :cond_3f
    const/16 v68, 0x0

    .line 1874
    :goto_3f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_40

    const/16 v69, 0x1

    goto :goto_40

    :cond_40
    const/16 v69, 0x0

    .line 1876
    :goto_40
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_41

    const/16 v70, 0x1

    goto :goto_41

    :cond_41
    const/16 v70, 0x0

    .line 1878
    :goto_41
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readInt()I

    move-result v71

    .line 1882
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_42

    const/16 v72, 0x1

    goto :goto_42

    :cond_42
    const/16 v72, 0x0

    .line 1884
    :goto_42
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_43

    const/16 v73, 0x1

    goto :goto_43

    :cond_43
    const/16 v73, 0x0

    .line 1886
    :goto_43
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_44

    const/16 v74, 0x1

    goto :goto_44

    :cond_44
    const/16 v74, 0x0

    .line 1888
    :goto_44
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_45

    const/16 v75, 0x1

    goto :goto_45

    :cond_45
    const/16 v75, 0x0

    .line 1890
    :goto_45
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_46

    const/16 v76, 0x1

    goto :goto_46

    :cond_46
    const/16 v76, 0x0

    .line 1893
    :goto_46
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_47

    const/16 v77, 0x1

    goto :goto_47

    :cond_47
    const/16 v77, 0x0

    .line 1896
    :goto_47
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_48

    const/16 v78, 0x1

    goto :goto_48

    :cond_48
    const/16 v78, 0x0

    .line 1899
    :goto_48
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_49

    const/16 v79, 0x1

    goto :goto_49

    :cond_49
    const/16 v79, 0x0

    .line 1901
    :goto_49
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4a

    const/16 v80, 0x1

    goto :goto_4a

    :cond_4a
    const/16 v80, 0x0

    .line 1903
    :goto_4a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4b

    const/16 v81, 0x1

    goto :goto_4b

    :cond_4b
    const/16 v81, 0x0

    .line 1905
    :goto_4b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4c

    const/16 v82, 0x1

    goto :goto_4c

    :cond_4c
    const/16 v82, 0x0

    .line 1908
    :goto_4c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4d

    const/16 v83, 0x1

    goto :goto_4d

    :cond_4d
    const/16 v83, 0x0

    .line 1912
    :goto_4d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4e

    const/16 v84, 0x1

    goto :goto_4e

    :cond_4e
    const/16 v84, 0x0

    .line 1914
    :goto_4e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4f

    const/16 v85, 0x1

    goto :goto_4f

    :cond_4f
    const/16 v85, 0x0

    .line 1916
    :goto_4f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_50

    const/16 v86, 0x1

    goto :goto_50

    :cond_50
    const/16 v86, 0x0

    .line 1918
    :goto_50
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_51

    const/16 v87, 0x1

    goto :goto_51

    :cond_51
    const/16 v87, 0x0

    .line 1920
    :goto_51
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_52

    const/16 v88, 0x1

    goto :goto_52

    :cond_52
    const/16 v88, 0x0

    .line 1923
    :goto_52
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_53

    const/16 v89, 0x1

    goto :goto_53

    :cond_53
    const/16 v89, 0x0

    .line 1925
    :goto_53
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_54

    const/16 v90, 0x1

    goto :goto_54

    :cond_54
    const/16 v90, 0x0

    .line 1927
    :goto_54
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_55

    const/16 v91, 0x1

    goto :goto_55

    :cond_55
    const/16 v91, 0x0

    .line 1929
    :goto_55
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_56

    const/16 v92, 0x1

    goto :goto_56

    :cond_56
    const/16 v92, 0x0

    .line 1930
    :goto_56
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_57

    const/16 v93, 0x1

    goto :goto_57

    :cond_57
    const/16 v93, 0x0

    .line 1932
    :goto_57
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_58

    const/16 v94, 0x1

    goto :goto_58

    :cond_58
    const/16 v94, 0x0

    .line 1934
    :goto_58
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_59

    const/16 v95, 0x1

    goto :goto_59

    :cond_59
    const/16 v95, 0x0

    .line 1936
    :goto_59
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5a

    const/16 v96, 0x1

    goto :goto_5a

    :cond_5a
    const/16 v96, 0x0

    .line 1938
    :goto_5a
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5b

    const/16 v97, 0x1

    goto :goto_5b

    :cond_5b
    const/16 v97, 0x0

    .line 1940
    :goto_5b
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5c

    const/16 v98, 0x1

    goto :goto_5c

    :cond_5c
    const/16 v98, 0x0

    .line 1942
    :goto_5c
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5d

    const/16 v99, 0x1

    goto :goto_5d

    :cond_5d
    const/16 v99, 0x0

    .line 1945
    :goto_5d
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5e

    const/16 v100, 0x1

    goto :goto_5e

    :cond_5e
    const/16 v100, 0x0

    .line 1947
    :goto_5e
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5f

    const/16 v101, 0x1

    goto :goto_5f

    :cond_5f
    const/16 v101, 0x0

    .line 1949
    :goto_5f
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_60

    const/16 v102, 0x1

    goto :goto_60

    :cond_60
    const/16 v102, 0x0

    .line 1951
    :goto_60
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_61

    const/16 v103, 0x1

    goto :goto_61

    :cond_61
    const/16 v103, 0x0

    .line 1953
    :goto_61
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_62

    const/16 v104, 0x1

    goto :goto_62

    :cond_62
    const/16 v104, 0x0

    .line 1955
    :goto_62
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_63

    const/16 v105, 0x1

    goto :goto_63

    :cond_63
    const/16 v105, 0x0

    .line 1957
    :goto_63
    invoke-virtual/range {p1 .. p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_64

    const/16 v106, 0x1

    goto :goto_64

    :cond_64
    const/16 v106, 0x0

    .line 1960
    :goto_64
    new-instance v107, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-direct/range {v107 .. v107}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;-><init>()V

    .line 1963
    move-object/from16 v0, v107

    invoke-virtual {v0, v2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 1965
    move-object/from16 v0, v107

    invoke-virtual {v0, v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 1967
    move-object/from16 v0, v107

    invoke-virtual {v0, v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 1969
    move-object/from16 v0, v107

    invoke-virtual {v0, v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 1971
    move-object/from16 v0, v107

    invoke-virtual {v0, v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 1973
    move-object/from16 v0, v107

    invoke-virtual {v0, v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 1975
    move-object/from16 v0, v107

    invoke-virtual {v0, v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 1977
    move-object/from16 v0, v107

    invoke-virtual {v0, v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 1979
    move-object/from16 v0, v107

    invoke-virtual {v0, v10}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 1981
    move-object/from16 v0, v107

    invoke-virtual {v0, v11}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 1983
    move-object/from16 v0, v107

    invoke-virtual {v0, v12}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 1985
    move-object/from16 v0, v107

    invoke-virtual {v0, v13}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 1989
    move-object/from16 v0, v107

    invoke-virtual {v0, v14}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 1991
    move-object/from16 v0, v107

    invoke-virtual {v0, v15}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 1993
    move-object/from16 v0, v107

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 1995
    move-object/from16 v0, v107

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 1997
    move-object/from16 v0, v107

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWearMessagePush(Z)V

    .line 2001
    move-object/from16 v0, v107

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 2005
    move-object/from16 v0, v107

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 2013
    move-object/from16 v0, v107

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 2015
    move-object/from16 v0, v107

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 2017
    move-object/from16 v0, v107

    move/from16 v1, v23

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 2019
    move-object/from16 v0, v107

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 2021
    move-object/from16 v0, v107

    move/from16 v1, v25

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 2023
    move-object/from16 v0, v107

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 2025
    move-object/from16 v0, v107

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 2027
    move-object/from16 v0, v107

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 2030
    move-object/from16 v0, v107

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportCoreSleep(Z)V

    .line 2033
    move-object/from16 v0, v107

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetUserInfo(Z)V

    .line 2036
    move-object/from16 v0, v107

    move/from16 v1, v31

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 2039
    move-object/from16 v0, v107

    move/from16 v1, v32

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 2043
    move-object/from16 v0, v107

    move/from16 v1, v33

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 2045
    move-object/from16 v0, v107

    move/from16 v1, v34

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 2047
    move-object/from16 v0, v107

    move/from16 v1, v35

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 2051
    move-object/from16 v0, v107

    move/from16 v1, v36

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 2055
    move-object/from16 v0, v107

    move/from16 v1, v37

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 2057
    move-object/from16 v0, v107

    move/from16 v1, v38

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 2059
    move-object/from16 v0, v107

    move/from16 v1, v39

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 2063
    move-object/from16 v0, v107

    move/from16 v1, v40

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 2065
    move-object/from16 v0, v107

    move/from16 v1, v41

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 2069
    move-object/from16 v0, v107

    move/from16 v1, v42

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 2077
    move-object/from16 v0, v107

    move/from16 v1, v43

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 2079
    move-object/from16 v0, v107

    move/from16 v1, v44

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 2095
    move-object/from16 v0, v107

    move/from16 v1, v45

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 2097
    move-object/from16 v0, v107

    move/from16 v1, v46

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 2099
    move-object/from16 v0, v107

    move/from16 v1, v47

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 2103
    move-object/from16 v0, v107

    move/from16 v1, v48

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 2105
    move-object/from16 v0, v107

    move/from16 v1, v49

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 2107
    move-object/from16 v0, v107

    move/from16 v1, v50

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 2109
    move-object/from16 v0, v107

    move/from16 v1, v51

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 2111
    move-object/from16 v0, v107

    move/from16 v1, v52

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 2113
    move-object/from16 v0, v107

    move/from16 v1, v53

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 2117
    move-object/from16 v0, v107

    move/from16 v1, v54

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 2119
    move-object/from16 v0, v107

    move/from16 v1, v55

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 2121
    move-object/from16 v0, v107

    move/from16 v1, v56

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSSetParameter(Z)V

    .line 2123
    move-object/from16 v0, v107

    move/from16 v1, v57

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSPostProcessing(Z)V

    .line 2126
    move-object/from16 v0, v107

    move/from16 v1, v58

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 2130
    move-object/from16 v0, v107

    move/from16 v1, v59

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 2132
    move-object/from16 v0, v107

    move/from16 v1, v60

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 2134
    move-object/from16 v0, v107

    move/from16 v1, v61

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 2136
    move-object/from16 v0, v107

    move/from16 v1, v62

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 2138
    move-object/from16 v0, v107

    move/from16 v1, v63

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 2140
    move-object/from16 v0, v107

    move/from16 v1, v64

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 2142
    move-object/from16 v0, v107

    move/from16 v1, v65

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 2144
    move-object/from16 v0, v107

    move/from16 v1, v66

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 2146
    move-object/from16 v0, v107

    move/from16 v1, v67

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 2148
    move-object/from16 v0, v107

    move/from16 v1, v68

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 2150
    move-object/from16 v0, v107

    move/from16 v1, v69

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 2152
    move-object/from16 v0, v107

    move/from16 v1, v70

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 2154
    move-object/from16 v0, v107

    move/from16 v1, v71

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 2158
    move-object/from16 v0, v107

    move/from16 v1, v72

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 2160
    move-object/from16 v0, v107

    move/from16 v1, v73

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 2162
    move-object/from16 v0, v107

    move/from16 v1, v74

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 2164
    move-object/from16 v0, v107

    move/from16 v1, v75

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportEsim(Z)V

    .line 2166
    move-object/from16 v0, v107

    move/from16 v1, v76

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMultiSim(Z)V

    .line 2169
    move-object/from16 v0, v107

    move/from16 v1, v77

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPay(Z)V

    .line 2172
    move-object/from16 v0, v107

    move/from16 v1, v78

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureisSupportHeartRateEnable(Z)V

    .line 2175
    move-object/from16 v0, v107

    move/from16 v1, v79

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 2177
    move-object/from16 v0, v107

    move/from16 v1, v80

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 2179
    move-object/from16 v0, v107

    move/from16 v1, v81

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 2181
    move-object/from16 v0, v107

    move/from16 v1, v82

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportStress(Z)V

    .line 2183
    move-object/from16 v0, v107

    move/from16 v1, v83

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMidware(Z)V

    .line 2187
    move-object/from16 v0, v107

    move/from16 v1, v84

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSportTotal(Z)V

    .line 2189
    move-object/from16 v0, v107

    move/from16 v1, v85

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAccount(Z)V

    .line 2191
    move-object/from16 v0, v107

    move/from16 v1, v86

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportOneLevelMenu(Z)V

    .line 2193
    move-object/from16 v0, v107

    move/from16 v1, v87

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportDeleteMsg(Z)V

    .line 2195
    move-object/from16 v0, v107

    move/from16 v1, v88

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPosture(Z)V

    .line 2197
    move-object/from16 v0, v107

    move/from16 v1, v89

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMusicControl(Z)V

    .line 2199
    move-object/from16 v0, v107

    move/from16 v1, v90

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configruePressAutoMonitor(Z)V

    .line 2201
    move-object/from16 v0, v107

    move/from16 v1, v91

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportContinueHeartRate(Z)V

    .line 2203
    move-object/from16 v0, v107

    move/from16 v1, v92

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAtmosphere(Z)V

    .line 2205
    move-object/from16 v0, v107

    move/from16 v1, v93

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAutoDetectMode(Z)V

    .line 2207
    move-object/from16 v0, v107

    move/from16 v1, v94

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportFootWear(Z)V

    .line 2209
    move-object/from16 v0, v107

    move/from16 v1, v95

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportRunPosture(Z)V

    .line 2211
    move-object/from16 v0, v107

    move/from16 v1, v96

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureHeartRateRaiseAlarm(Z)V

    .line 2213
    move-object/from16 v0, v107

    move/from16 v1, v97

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGetHeartRateRaiseAlarmNumber(Z)V

    .line 2215
    move-object/from16 v0, v107

    move/from16 v1, v98

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGetHighAndMiddleSport(Z)V

    .line 2217
    move-object/from16 v0, v107

    move/from16 v1, v99

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->setSupportDefaultSwitch(Z)V

    .line 2218
    move-object/from16 v0, v107

    move/from16 v1, v100

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureChange_alarm(Z)V

    .line 2220
    move-object/from16 v0, v107

    move/from16 v1, v101

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportIntelligentHomeLinkage(Z)V

    .line 2221
    move-object/from16 v0, v107

    move/from16 v1, v102

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSyncBeforeOta(Z)V

    .line 2223
    move-object/from16 v0, v107

    move/from16 v1, v103

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportPhonesInfo(Z)V

    .line 2225
    move-object/from16 v0, v107

    move/from16 v1, v104

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportNotifyDeviceBroadCast(Z)V

    .line 2227
    move-object/from16 v0, v107

    move/from16 v1, v105

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupport_atrial_operator(Z)V

    .line 2229
    move-object/from16 v0, v107

    move/from16 v1, v106

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSetHrrHeartRateCapability(Z)V

    .line 2230
    return-object v107
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1676
    invoke-virtual {p0, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability$5;->b(I)[Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    return-object v0
.end method
