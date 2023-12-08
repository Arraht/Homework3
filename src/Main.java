public class Main {
    public static void main(String[] args) {
        // Задача №1:
        int users = 5;
        byte oneUserHours = 2;
        short twoUserHours = 6;
        long threeUserHours = 4L;
        float fourUserHours = 2.5f;
        double fiveUserHours = 3.5;
        System.out.println("Задача № 1:\n" + "\tЗначение переменной с типом int равно: " + users +
                "\n\tЗначение переменной с типом byte равно: " + oneUserHours +
                "\n\tЗначение переменной с типом short равно: " + twoUserHours +
                "\n\tЗначение переменной с типом long равно: " + threeUserHours +
                "\n\tЗначение переменной с типом float равно: " + fourUserHours +
                "\n\tЗначение переменной с типом double равно: " + fiveUserHours);
        // Задача № 2:
        float oneNumber = 27.12f;
        int twoNumber = 27897;
        short threeNumber = 569;
        double fourNumber = 2.786;
        byte fiveNumber = 67;
        short sixNumber = -159;
        long sevenNumber = 987678965549L;
        System.out.println("\nЗадача № 2: " + "\n\t" + oneNumber + "\n\t" + twoNumber + "\n\t" +
                threeNumber + "\n\t" + fourNumber +
                "\n\t" + fiveNumber + "\n\t" + sixNumber + "\n\t" + sevenNumber);
        // Задача № 3:
        byte oneTeacher = 23, twoTeacher = 27, threeTeacher = 30;
        short sheetsPaper = 480;
        int sumStudent = oneTeacher + twoTeacher + threeTeacher;
        int oneStudentSheetsPaper = sheetsPaper / sumStudent;
        System.out.println("\nЗадача № 3:\n\tУ Людмилы Павловны = " + oneTeacher + " ученика\n\tУ Анны Сергеевны = " +
                twoTeacher + " учеников\n\tУ Екатерины Андреевны = " + threeTeacher +
                " учеников\n\tОбщее число листов бумаги = " + sheetsPaper + " штук\n\tОбщее число учеников = " +
                sumStudent + " человек\n\tКоличество листов на 1 ученика: " + oneStudentSheetsPaper + " штук");
        // Задача № 4:
        byte machinePerformance = 16, onePreparationTime = 2;
        short twoPreparationTime = 20, threePreparationTime = 1440, fourPreparationTime = 4320;
        int fivePreparationTime = 43800;
        int machinePerformanceOneMinutes = machinePerformance / onePreparationTime;
        int machinePerformanceTwentyMinutes = machinePerformanceOneMinutes * twoPreparationTime;
        int machinePerformanceDay = machinePerformanceOneMinutes * threePreparationTime;
        int machinePerformanceThreeDay = machinePerformanceOneMinutes * fourPreparationTime;
        int machinePerformanceMonth = machinePerformanceOneMinutes * fivePreparationTime;
        System.out.println("\nЗадача № 4:\n\tПроизводительность машины = " + machinePerformance
                + " бутылок за " + onePreparationTime + " минуты\n\tПроизводительность машины = " +
                machinePerformanceOneMinutes + " бутылок за 1 минуту\n\tПроизводительность машины = " +
                machinePerformanceTwentyMinutes + " бутылок за " + twoPreparationTime +
                " минут\n\tПроизводительность машины = " + machinePerformanceDay +
                " бутылок за сутки\n\tПроизводительность машины = " + machinePerformanceThreeDay +
                " бутылок за 3 дня\n\tПроизводительность машины = " + machinePerformanceMonth + " бутылок за месяц");
        // Задача № 5:
        byte totalCansPaint = 120, whitePaintConsumption = 2, brownPaintConsumption = 4;
        int totalPaintConsumption, totalNumberClasses, amountWhitePaint, amountBrownPaint;
        totalPaintConsumption = whitePaintConsumption + brownPaintConsumption;
        totalNumberClasses = totalCansPaint / totalPaintConsumption;
        amountWhitePaint = totalNumberClasses * whitePaintConsumption;
        amountBrownPaint = totalNumberClasses * brownPaintConsumption;
        System.out.println("\nЗадача № 5:\n\tОбщее количество банок краски = " + totalCansPaint +
                " штук\n\tРасход банок белой краски на 1 класс = " + whitePaintConsumption +
                " штуки\n\tРасход банок коричневой краски на 1 класс = " + brownPaintConsumption +
                " штуки\n\tОбщий расход банок краски на 1 класс = " + totalPaintConsumption +
                " штук\n\tКолличество классов = " + totalNumberClasses +
                " классов\n\tКолличество купленной белой краски = " + amountWhitePaint +
                " банок\n\tКолличество купленной коричневой краски = " + amountBrownPaint +
                " банкок\n\tВ школе, где " + totalNumberClasses + " классов, нужно " + amountWhitePaint +
                " банок белой краски и " + amountBrownPaint + " банок коричневой краски");
        // Задача № 6:
        short milkQuantity = 200;
        byte quantityBananas = 5, iceCreamQuantity = 2, numberEggs = 4;
        byte bananaWeightOne = 80, milkWeightOne = 105, iceCreamWeightOne = 100, eggWeightOne = 70;
        double totalWeightGrams = (quantityBananas * bananaWeightOne) + (milkWeightOne * milkQuantity) +
                (iceCreamQuantity * iceCreamWeightOne) + (numberEggs * eggWeightOne);
        double totalWeightKilograms = totalWeightGrams / 1000;
        System.out.println("\nЗадача № 6\n\tКолличество бананов = " + quantityBananas +
                " штук, где 1 банан по " + bananaWeightOne + " грамм\n\tКоичество молока = " + milkQuantity +
                " мл, где 100 мл по " + milkWeightOne + " грамм\n\tКоличество мороженного = " + iceCreamQuantity +
                " брикета по " + iceCreamWeightOne + " грамм\n\tКоличество яиц = " + numberEggs +
                " яйца, где 1 яйцо по " + eggWeightOne + " грамм\n\tОбщий вес в граммах = " + totalWeightGrams +
                " грамм\n\tОбший вес в килограммах = " + totalWeightKilograms + " килограмм");
        // Задача № 7:
        int targetWeightLossKilograms = 7;
        short oneWeightLossGrams = 250, twoWeightLossGrams = 500;
        int resultOneWeightLossGrams = (targetWeightLossKilograms * 1000) / oneWeightLossGrams;
        int resultTwoWeightLossGrams = (targetWeightLossKilograms * 1000) / twoWeightLossGrams;
        int AverageResult = (resultOneWeightLossGrams + resultTwoWeightLossGrams) / 2;
        System.out.println("\nЗадача № 7:\n\tНужно сбросить " + targetWeightLossKilograms +
                " килограмм\n\tПри потере веса по " + oneWeightLossGrams + " грамм, понадобится " +
                resultOneWeightLossGrams + " дней на похудение\n\tПри потере веса по " + twoWeightLossGrams +
                " грамм, понадобится " + resultTwoWeightLossGrams +
                " дней на похудение\n\tВ среднем темпе понадобится " + AverageResult + " день на похудение");
        // Задача № 8:
        int masha = 67760, denis = 83690, kristina = 76230;
        int beforeMashaYears = masha * 12, beforeDenisYears = denis * 12,
                beforeKristinaYears = kristina * 12;
        System.out.println("\nЗадача № 8:\n\tЗапрлата Маши в месяц до повышения = " + masha +
                " рублей, годовой доход до повышения = " + beforeMashaYears +
                " рублей\n\tЗарплата Дениса в месяц до повышения = " + denis +
                " рублей, годовой доход до повышения = " + beforeDenisYears +
                " рублей\n\tЗарплата Кристины в месяц до повышения = " + kristina +
                " рублей, годовой доход до повышения = " + beforeKristinaYears + " рублей.");
        int mashaNew = (masha * 10) / 100, denisNew = (denis * 10)/100, kristinaNew = (kristina * 10) / 100;
        int afterMahaMonth = mashaNew + masha, afterDenisMonth = denisNew + denis, afterKristinaMonth = kristinaNew +
                kristina;
        int afterMashaYears = afterMahaMonth * 12, afterDenisYears = afterDenisMonth * 12,
                afterKristinaYears = afterKristinaMonth * 12;
        int differenceYearMasha = afterMashaYears - beforeMashaYears;
        int differenceYearDenis = afterDenisYears - beforeDenisYears;
        int differenceYearKristina = afterKristinaYears - beforeKristinaYears;
        System.out.println("\n\tМаша теперь получает " + afterMahaMonth +
                " рублей. Годовой доход вырос на " + differenceYearMasha + " рублей и составляет теперь " +
                afterMashaYears + " рублей.\n\tДенис теперь получает " + afterDenisMonth +
                " рублей. Годовой доход вырос на " + differenceYearDenis + " и составляет теперь "
                + afterDenisYears + " рублей\n\tКристина теперь получает " + afterKristinaMonth +
                " рублей. Годовой доход вырос на " + differenceYearKristina +
                " рублей и составляет теперь " + afterKristinaYears + " рублей.");}}
